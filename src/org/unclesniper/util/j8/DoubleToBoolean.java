package org.unclesniper.util.j8;

public interface DoubleToBoolean extends IODoubleToBoolean, ThrowingDoubleToBoolean<RuntimeException> {

	@Override
	boolean apply(double arg);

}
