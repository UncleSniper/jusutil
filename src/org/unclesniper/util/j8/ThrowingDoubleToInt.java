package org.unclesniper.util.j8;

public interface ThrowingDoubleToInt<ExceptionT extends Throwable> {

	int apply(double arg) throws ExceptionT;

}
