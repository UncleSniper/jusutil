package org.unclesniper.util.j8;

import java.io.IOException;

public interface IOFloatToObject<ReturnT> {

	ReturnT apply(float arg) throws IOException;

}
