package org.unclesniper.util.j8;

import java.io.IOException;

public interface IOObjectToLong<ArgT> {

	long apply(ArgT arg) throws IOException;

}
