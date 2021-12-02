package org.unclesniper.util.j8;

import java.io.IOException;

public interface IOObjectSink<ValueT> {

	void putObject(ValueT value) throws IOException;

}
