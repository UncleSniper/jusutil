package org.unclesniper.util.http;

import java.io.IOException;

public interface HTTPRequestCustomizer {

	void customizeRequest(HTTPRequestOptions request) throws IOException;

}
