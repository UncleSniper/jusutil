package org.unclesniper.util.j8;

import java.io.IOException;

public interface IOObjectToObject<ArgT, ReturnT> {

	ReturnT apply(ArgT arg) throws IOException;

}
