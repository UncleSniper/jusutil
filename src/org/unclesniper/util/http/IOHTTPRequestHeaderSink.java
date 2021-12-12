package org.unclesniper.util.http;

import java.io.IOException;

public interface IOHTTPRequestHeaderSink {

	void setRequestHeader(String name, String value) throws IOException;

}
