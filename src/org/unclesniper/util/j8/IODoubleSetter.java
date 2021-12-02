package org.unclesniper.util.j8;

import java.io.IOException;

public interface IODoubleSetter<BaseT> {

	void setDouble(BaseT base, double value) throws IOException;

}
