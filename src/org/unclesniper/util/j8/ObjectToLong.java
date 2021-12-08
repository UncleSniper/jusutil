package org.unclesniper.util.j8;

public interface ObjectToLong<ArgT> extends IOObjectToLong<ArgT> {

	@Override
	long apply(ArgT arg);

}
