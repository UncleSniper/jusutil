package org.unclesniper.util.j8;

public interface ObjectToShort<ArgT> extends IOObjectToShort<ArgT> {

	@Override
	short apply(ArgT arg);

}
