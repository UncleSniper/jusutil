package org.unclesniper.util.j8;

public interface ByteToDouble extends IOByteToDouble, ThrowingByteToDouble<RuntimeException> {

	@Override
	double apply(byte arg);

}
