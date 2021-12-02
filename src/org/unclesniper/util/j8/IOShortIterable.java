package org.unclesniper.util.j8;

import java.io.IOException;

public interface IOShortIterable extends IOIntIterable {

	IOShortIterator shortIterator() throws IOException;

}
