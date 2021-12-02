package org.unclesniper.util.j8;

import java.io.IOException;

public interface IOLongGetter<BaseT> {

	long getLong(BaseT base) throws IOException;

}
