package org.unclesniper.util.j8;

import java.io.IOException;

public interface IOBooleanToObject<ReturnT> {

	ReturnT apply(boolean arg) throws IOException;

}
