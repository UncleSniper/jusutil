package org.unclesniper.util.j8;

public interface ObjectToInt<ArgT> extends IOObjectToInt<ArgT> {

	@Override
	int apply(ArgT arg);

}
