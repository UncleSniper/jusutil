package org.unclesniper.util.j8;

public interface DoubleToFloat extends IODoubleToFloat, ThrowingDoubleToFloat<RuntimeException> {

	@Override
	float apply(double arg);

}
