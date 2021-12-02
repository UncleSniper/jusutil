package org.unclesniper.util.j8;

import java.io.IOException;

public interface IOObjectP<ValueT> {

	boolean testObject(ValueT value) throws IOException;

}
