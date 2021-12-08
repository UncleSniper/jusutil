package org.unclesniper.util.j8;

import java.io.IOException;

public interface IOObjectToDouble<ArgT> {

	double apply(ArgT arg) throws IOException;

}
