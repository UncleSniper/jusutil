package org.unclesniper.util.http;

import java.io.IOException;

public interface HTTPRequest extends HTTPRequestOptions {

	HTTPResponse request() throws IOException;

}
