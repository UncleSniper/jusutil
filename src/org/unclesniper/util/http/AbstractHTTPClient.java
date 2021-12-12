package org.unclesniper.util.http;

import java.util.Map;
import java.util.HashMap;

import static org.unclesniper.util.ArgUtils.notNull;

public abstract class AbstractHTTPClient implements HTTPClient {

	private final Map<String, HTTPRequestHeaderSource> defaultHeaders
			= new HashMap<String, HTTPRequestHeaderSource>();

	private String baseURL;

	private HTTPProxy defaultProxy;

	public AbstractHTTPClient() {}

	public AbstractHTTPClient(String baseURL) {
		this.baseURL = baseURL;
	}

	public String getBaseURL() {
		return baseURL;
	}

	public void setBaseURL(String baseURL) {
		if(baseURL != null && baseURL.length() == 0)
			baseURL = null;
		this.baseURL = baseURL;
	}

	protected void setDefaultRequestHeaders(HTTPVerb verb, String url, HTTPRequestHeaderSink sink) {
		for(Map.Entry<String, HTTPRequestHeaderSource> entry : defaultHeaders.entrySet())
			entry.getValue().setRequestHeaders(verb, url, sink);
	}

	@Override
	public void setDefaultRequestHeader(String name, HTTPRequestHeaderSource value) {
		String lcname = notNull(name, "name").toLowerCase();
		if(value == null)
			defaultHeaders.remove(lcname);
		else
			defaultHeaders.put(lcname, value);
	}

	@Override
	public HTTPProxy getDefaultProxy() {
		return defaultProxy;
	}

	@Override
	public void setDefaultProxy(HTTPProxy defaultProxy) {
		this.defaultProxy = defaultProxy;
	}

	protected abstract HTTPRequest makeRequest(HTTPVerb verb, String url);

	@Override
	public HTTPRequest request(HTTPVerb verb, String url) {
		notNull(verb, "verb");
		String effectiveURL;
		if(url != null && url.length() == 0)
			url = null;
		if(baseURL == null) {
			if(url == null)
				throw new IllegalArgumentException("Base URL and request URL must not both be null");
			effectiveURL = url;
		}
		else {
			if(url == null)
				effectiveURL = baseURL;
			else
				effectiveURL = baseURL + url;
		}
		HTTPRequest request = makeRequest(verb, effectiveURL);
		setDefaultRequestHeaders(verb, effectiveURL, request::setRequestHeader);
		return request;
	}

}
