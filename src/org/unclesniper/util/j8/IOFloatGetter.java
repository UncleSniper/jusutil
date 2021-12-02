package org.unclesniper.util.j8;

import java.io.IOException;

public interface IOFloatGetter<BaseT> {

	float getFloat(BaseT base) throws IOException;

}
