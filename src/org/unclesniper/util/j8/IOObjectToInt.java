package org.unclesniper.util.j8;

import java.io.IOException;

public interface IOObjectToInt<ArgT> {

	int apply(ArgT arg) throws IOException;

}
