package org.unclesniper.util.j8;

import java.io.IOException;

public interface IOFloatSetter<BaseT> {

	void setFloat(BaseT base, float value) throws IOException;

}
