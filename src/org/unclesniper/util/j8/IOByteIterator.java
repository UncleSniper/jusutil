package org.unclesniper.util.j8;

import java.io.IOException;

public interface IOByteIterator extends IOIteratorBase {

	byte nextByte() throws IOException;

}
