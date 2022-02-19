package org.unclesniper.util.j8;

public interface DoubleToByte extends IODoubleToByte, ThrowingDoubleToByte<RuntimeException> {

	@Override
	byte apply(double arg);

}
