package org.unclesniper.util.j8;

public interface ObjectToDouble<ArgT> extends IOObjectToDouble<ArgT> {

	@Override
	double apply(ArgT arg);

}
