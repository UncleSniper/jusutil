package org.unclesniper.util.j8;

public interface DoubleToObject<ReturnT>
		extends IODoubleToObject<ReturnT>, ThrowingDoubleToObject<ReturnT, RuntimeException> {

	@Override
	ReturnT apply(double arg);

}
