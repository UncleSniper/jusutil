package org.unclesniper.util.j8;

public interface ObjectToFloat<ArgT> extends IOObjectToFloat<ArgT> {

	@Override
	float apply(ArgT arg);

}
