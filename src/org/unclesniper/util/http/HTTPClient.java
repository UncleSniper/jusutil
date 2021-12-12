package org.unclesniper.util.http;

public interface HTTPClient {

	void setDefaultRequestHeader(String name, HTTPRequestHeaderSource value);

	default void setDefaultRequestHeader(String name, String value) {
		HTTPRequestHeaderSource source;
		if(value == null)
			source = null;
		else
			source = (verb, url, request) -> request.setRequestHeader(name, value);
		this.setDefaultRequestHeader(name, source);
	}

	HTTPProxy getDefaultProxy();

	void setDefaultProxy(HTTPProxy proxy);

	HTTPRequest request(HTTPVerb verb, String url);

}
