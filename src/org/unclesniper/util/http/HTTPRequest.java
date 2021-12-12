package org.unclesniper.util.http;

import java.io.IOException;
import java.io.InputStream;

public interface HTTPRequest extends HTTPRequestHeaderSink {

	String getRequestURL();

	HTTPVerb getVerb();

	InputStream getRequestBody();

	void setRequestBody(InputStream body);

	String getRequestHeader(String name);

	HTTPProxy getProxy();

	void setProxy(HTTPProxy proxy);

	HTTPResponse request() throws IOException;

}
