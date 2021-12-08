package org.unclesniper.util.j8;

public interface ObjectToObject<ArgT, ReturnT> extends IOObjectToObject<ArgT, ReturnT> {

	@Override
	ReturnT apply(ArgT arg);

}
