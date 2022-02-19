package org.unclesniper.util.j8;

public interface ThrowingDoubleToLong<ExceptionT extends Throwable> {

	long apply(double arg) throws ExceptionT;

}
