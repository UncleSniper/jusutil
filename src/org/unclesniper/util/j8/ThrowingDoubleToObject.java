package org.unclesniper.util.j8;

public interface ThrowingDoubleToObject<ReturnT, ExceptionT extends Throwable> {

	ReturnT apply(double arg) throws ExceptionT;

}
