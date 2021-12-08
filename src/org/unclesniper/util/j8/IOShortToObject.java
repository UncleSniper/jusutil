package org.unclesniper.util.j8;

import java.io.IOException;

public interface IOShortToObject<ReturnT> {

	ReturnT apply(short arg) throws IOException;

}
