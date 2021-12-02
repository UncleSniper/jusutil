package org.unclesniper.util.j8;

import java.io.IOException;

public interface IOIntIterable extends IOLongIterable {

	IOIntIterator intIterator() throws IOException;

}
