package org.unclesniper.util.j8;

import java.io.IOException;

public interface IOLongIterable {

	IOLongIterator longIterator() throws IOException;

}
