package org.unclesniper.util.j8;

import java.io.IOException;

public interface IOObjectToBoolean<ArgT> {

	boolean apply(ArgT arg) throws IOException;

}
