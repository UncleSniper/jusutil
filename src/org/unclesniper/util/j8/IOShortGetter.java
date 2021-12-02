package org.unclesniper.util.j8;

import java.io.IOException;

public interface IOShortGetter<BaseT> {

	short getShort(BaseT base) throws IOException;

}
