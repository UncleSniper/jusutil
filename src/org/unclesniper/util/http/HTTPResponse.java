package org.unclesniper.util.http;

import java.io.IOException;
import java.io.InputStream;

import static org.unclesniper.util.ArgUtils.notNull;

public interface HTTPResponse extends AutoCloseable {

	int getResponseCode() throws IOException;

	String getResponseMessage() throws IOException;

	String getResponseHeader(String name) throws IOException;

	default String getContentType() throws IOException {
		return HTTPResponse.getContentType(this);
	}

	default String getContentCharset() throws IOException {
		return HTTPResponse.getContentCharset(this);
	}

	InputStream getResponseBody() throws IOException;

	@Override
	void close() throws IOException;

	public static String getContentType(String header) {
		if(header == null)
			return null;
		int pos = header.indexOf(';');
		if(pos == 0)
			return null;
		if(pos < 0)
			return header;
		return header.substring(0, pos);
	}

	public static String getContentType(HTTPResponse response) throws IOException {
		return HTTPResponse.getContentType(notNull(response, "response").getResponseHeader("Content-Type"));
	}

	public static String getContentCharset(String header) {
		if(header == null)
			return null;
		int length = header.length(), start = 0;
		for(;;) {
			start = header.indexOf(';', start);
			if(start < 0)
				return null;
			++start;
			while(start < length && header.charAt(start) == ' ')
				++start;
			if(length - start < 9)
				return null;
			if(header.substring(start, start + 8).equalsIgnoreCase("charset=")) {
				int next = header.indexOf(';', start + 8);
				if(next == start + 8)
					return null;
				if(next < 0)
					return header.substring(start + 8).trim();
				return header.substring(start + 8, next).trim();
			}
		}
	}

	public static String getContentCharset(HTTPResponse response) throws IOException {
		return HTTPResponse.getContentCharset(notNull(response, "response").getResponseHeader("Content-Type"));
	}

}
