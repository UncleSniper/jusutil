package org.unclesniper.util.http;

import java.net.URL;
import java.net.Proxy;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringWriter;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.HttpURLConnection;
import org.unclesniper.util.IOUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;

import static org.unclesniper.util.ArgUtils.notNull;

public class URLConnectionHTTPClient extends AbstractHTTPClient {

	private static final class URLConnectionHTTPRequest extends AbstractHTTPRequest {

		public URLConnectionHTTPRequest(HTTPVerb verb, String requestURL) {
			super(verb, requestURL);
		}

		@Override
		public HTTPResponse request() throws IOException {
			URL url = new URL(getRequestURL());
			Proxy proxy = URLConnectionHTTPClient.makeProxy(getProxy());
			HttpURLConnection conn;
			if(proxy == null)
				conn = (HttpURLConnection)url.openConnection();
			else
				conn = (HttpURLConnection)url.openConnection(proxy);
			conn.setRequestMethod(getVerb().toString());
			setRequestHeaders(conn::setRequestProperty);
			InputStream body = getRequestBody();
			if(body != null) {
				if(HTTPDebug.DEBUG_ON) {
					ByteArrayOutputStream baos = new ByteArrayOutputStream();
					IOUtils.copy(body, baos);
					byte[] bodyBytes = baos.toByteArray();
					InputStreamReader isr = new InputStreamReader(new ByteArrayInputStream(bodyBytes),
							StandardCharsets.ISO_8859_1);
					StringWriter sw = new StringWriter();
					IOUtils.copy(isr, sw);
					System.err.println("*** HTTP request #" + requestID + ": Setting body to: " + sw);
					body = new ByteArrayInputStream(bodyBytes);
				}
				conn.setDoOutput(true);
				conn.connect();
				try(OutputStream out = conn.getOutputStream()) {
					IOUtils.copy(body, out);
				}
			}
			else
				conn.connect();
			return new URLConnectionHTTPResponse(conn);
		}

	}

	private static final class URLConnectionHTTPResponse implements HTTPResponse {

		private final HttpURLConnection connection;

		private final InputStream body;

		public URLConnectionHTTPResponse(HttpURLConnection connection) throws IOException {
			this.connection = connection;
			body = connection.getInputStream();
		}

		@Override
		public int getResponseCode() throws IOException {
			return connection.getResponseCode();
		}

		@Override
		public String getResponseMessage() throws IOException {
			return connection.getResponseMessage();
		}

		@Override
		public String getResponseHeader(String name) {
			return connection.getHeaderField(notNull(name, "name"));
		}

		@Override
		public InputStream getResponseBody() {
			return body;
		}

		@Override
		public void close() throws IOException {
			body.close();
		}

	}

	public URLConnectionHTTPClient() {}

	public URLConnectionHTTPClient(String baseURL) {
		super(baseURL);
	}

	@Override
	protected HTTPRequest makeRequest(HTTPVerb verb, String url) {
		return new URLConnectionHTTPRequest(verb, url);
	}

	public static Proxy makeProxy(HTTPProxy proxy) {
		if(proxy == null)
			return null;
		Proxy.Type type = proxy.getType();
		if(type == null)
			type = Proxy.Type.HTTP;
		else if(type == Proxy.Type.DIRECT)
			return null;
		String host = proxy.getHost();
		int port = proxy.getPort();
		if((host != null) != (port > 0))
			throw new IllegalArgumentException(host == null ? "Proxy has a port set, but no host"
					: "Proxy has a host set, but no port");
		if(host == null)
			return null;
		return new Proxy(type, new InetSocketAddress(host, port));
	}

}
