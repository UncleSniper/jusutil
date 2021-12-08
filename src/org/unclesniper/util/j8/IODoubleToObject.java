package org.unclesniper.util.j8;

import java.io.IOException;

public interface IODoubleToObject<ReturnT> {

	ReturnT apply(double arg) throws IOException;

}
