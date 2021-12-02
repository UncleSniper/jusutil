package org.unclesniper.util.j8;

import java.io.IOException;

public interface IOIntGetter<BaseT> {

	int getInt(BaseT base) throws IOException;

}
