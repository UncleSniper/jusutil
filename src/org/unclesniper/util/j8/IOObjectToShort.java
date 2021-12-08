package org.unclesniper.util.j8;

import java.io.IOException;

public interface IOObjectToShort<ArgT> {

	short apply(ArgT arg) throws IOException;

}
