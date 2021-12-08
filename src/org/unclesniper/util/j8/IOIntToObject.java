package org.unclesniper.util.j8;

import java.io.IOException;

public interface IOIntToObject<ReturnT> {

	ReturnT apply(int arg) throws IOException;

}
