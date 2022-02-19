package org.unclesniper.util.j8;

public interface ThrowingBooleanToDouble<ExceptionT extends Throwable> {

	double apply(boolean arg) throws ExceptionT;

}
