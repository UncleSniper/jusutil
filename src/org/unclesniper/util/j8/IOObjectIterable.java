package org.unclesniper.util.j8;

import java.io.IOException;

public interface IOObjectIterable<ElementT> {

	IOObjectIterator<ElementT> objectIterator() throws IOException;

}
