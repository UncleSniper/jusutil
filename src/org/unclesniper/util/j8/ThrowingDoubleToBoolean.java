package org.unclesniper.util.j8;

public interface ThrowingDoubleToBoolean<ExceptionT extends Throwable> {

	boolean apply(double arg) throws ExceptionT;

}
