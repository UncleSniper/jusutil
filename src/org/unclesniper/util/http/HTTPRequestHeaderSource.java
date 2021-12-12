package org.unclesniper.util.http;

public interface HTTPRequestHeaderSource {

	void setRequestHeaders(HTTPVerb verb, String url, HTTPRequestHeaderSink request);

}
