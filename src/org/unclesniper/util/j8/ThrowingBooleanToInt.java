package org.unclesniper.util.j8;

public interface ThrowingBooleanToInt<ExceptionT extends Throwable> {

	int apply(boolean arg) throws ExceptionT;

}
