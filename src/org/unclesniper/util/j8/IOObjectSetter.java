package org.unclesniper.util.j8;

import java.io.IOException;

public interface IOObjectSetter<BaseT, PropertyT> {

	void setProperty(BaseT base, PropertyT value) throws IOException;

}
