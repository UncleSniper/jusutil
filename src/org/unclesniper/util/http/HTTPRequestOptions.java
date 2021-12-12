package org.unclesniper.util.http;

import java.io.InputStream;

public interface HTTPRequestOptions extends HTTPRequestHeaderSink {

	String getRequestURL();

	HTTPVerb getVerb();

	InputStream getRequestBody();

	void setRequestBody(InputStream body);

	String getRequestHeader(String name);

	HTTPProxy getProxy();

	void setProxy(HTTPProxy proxy);

}
