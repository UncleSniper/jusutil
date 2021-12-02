package org.unclesniper.util.j8;

import java.io.IOException;

public interface IOObjectFactory<ValueT> {

	ValueT newObject() throws IOException;

}
