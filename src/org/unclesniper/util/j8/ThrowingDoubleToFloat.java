package org.unclesniper.util.j8;

public interface ThrowingDoubleToFloat<ExceptionT extends Throwable> {

	float apply(double arg) throws ExceptionT;

}
