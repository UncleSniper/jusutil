package org.unclesniper.util.j8;

public interface DoubleToDouble extends IODoubleToDouble, ThrowingDoubleToDouble<RuntimeException> {

	@Override
	double apply(double arg);

}
