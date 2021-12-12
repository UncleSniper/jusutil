package org.unclesniper.util.http;

import java.util.Map;
import java.util.HashMap;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicLong;

import static org.unclesniper.util.ArgUtils.notNull;

public abstract class AbstractHTTPRequest implements HTTPRequest {

	private static final AtomicLong REQUEST_ID = new AtomicLong();

	private final String requestURL;

	private final HTTPVerb verb;

	private InputStream requestBody;

	private final Map<String, String> headers = new HashMap<String, String>();

	private HTTPProxy proxy;

	protected final long requestID = AbstractHTTPRequest.REQUEST_ID.getAndIncrement();

	public AbstractHTTPRequest(HTTPVerb verb, String requestURL) {
		this.verb = notNull(verb, "verb");
		this.requestURL = notNull(requestURL, "requestURL");
		if(HTTPDebug.DEBUG_ON)
			System.err.println("*** HTTP request #" + requestID + ": Creating as " + verb.name() + ' ' + requestURL);
	}

	protected void setRequestHeaders(IOHTTPRequestHeaderSink sink) throws IOException {
		for(Map.Entry<String, String> entry : headers.entrySet()) {
			String key = entry.getKey(), value = entry.getValue();
			if(HTTPDebug.DEBUG_ON)
				System.err.println("*** HTTP request #" + requestID + ": Setting header '" + key + "' to '"
						+ value + '\'');
			sink.setRequestHeader(key, value);
		}
	}

	@Override
	public String getRequestURL() {
		return requestURL;
	}

	@Override
	public HTTPVerb getVerb() {
		return verb;
	}

	@Override
	public InputStream getRequestBody() {
		return requestBody;
	}

	@Override
	public void setRequestBody(InputStream requestBody) {
		this.requestBody = requestBody;
	}

	@Override
	public String getRequestHeader(String name) {
		return headers.get(notNull(name, "name"));
	}

	@Override
	public void setRequestHeader(String name, String value) {
		notNull(name, "name");
		if(value == null)
			headers.remove(name);
		else
			headers.put(name, value);
	}

	@Override
	public HTTPProxy getProxy() {
		return proxy;
	}

	@Override
	public void setProxy(HTTPProxy proxy) {
		this.proxy = proxy;
	}

}
