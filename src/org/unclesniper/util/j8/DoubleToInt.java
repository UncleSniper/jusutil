package org.unclesniper.util.j8;

public interface DoubleToInt extends IODoubleToInt, ThrowingDoubleToInt<RuntimeException> {

	@Override
	int apply(double arg);

}
