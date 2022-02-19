package org.unclesniper.util.j8;

public interface DoubleToLong extends IODoubleToLong, ThrowingDoubleToLong<RuntimeException> {

	@Override
	long apply(double arg);

}
