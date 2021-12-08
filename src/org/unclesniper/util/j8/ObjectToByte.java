package org.unclesniper.util.j8;

public interface ObjectToByte<ArgT> extends IOObjectToByte<ArgT> {

	@Override
	byte apply(ArgT arg);

}
