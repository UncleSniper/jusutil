package org.unclesniper.util.j8;

import java.io.IOException;

public interface IOObjectToFloat<ArgT> {

	float apply(ArgT arg) throws IOException;

}
