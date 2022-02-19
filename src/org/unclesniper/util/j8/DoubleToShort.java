package org.unclesniper.util.j8;

public interface DoubleToShort extends IODoubleToShort, ThrowingDoubleToShort<RuntimeException> {

	@Override
	short apply(double arg);

}
