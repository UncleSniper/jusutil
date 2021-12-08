package org.unclesniper.util.j8;

import java.io.IOException;

public interface IOByteToObject<ReturnT> {

	ReturnT apply(byte arg) throws IOException;

}
