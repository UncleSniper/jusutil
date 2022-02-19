package org.unclesniper.util.j8;

public interface ThrowingDoubleToDouble<ExceptionT extends Throwable> {

	double apply(double arg) throws ExceptionT;

}
