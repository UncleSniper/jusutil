package org.unclesniper.util.j8;

public interface ThrowingDoubleToShort<ExceptionT extends Throwable> {

	short apply(double arg) throws ExceptionT;

}
