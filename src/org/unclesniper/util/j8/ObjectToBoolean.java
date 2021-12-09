package org.unclesniper.util.j8;

public interface ObjectToBoolean<ArgT> extends IOObjectToBoolean<ArgT> {

	@Override
	boolean apply(ArgT arg);

}
