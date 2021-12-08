package org.unclesniper.util.j8;

import java.io.IOException;

public interface IOObjectToByte<ArgT> {

	byte apply(ArgT arg) throws IOException;

}
