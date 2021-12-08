package org.unclesniper.util.j8;

import java.io.IOException;

public interface IOLongToObject<ReturnT> {

	ReturnT apply(long arg) throws IOException;

}
