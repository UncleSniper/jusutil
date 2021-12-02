package org.unclesniper.util.j8;

import java.io.IOException;

public interface IOIntSetter<BaseT> {

	void setInt(BaseT base, int value) throws IOException;

}
