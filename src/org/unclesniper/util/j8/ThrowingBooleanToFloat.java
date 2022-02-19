package org.unclesniper.util.j8;

public interface ThrowingBooleanToFloat<ExceptionT extends Throwable> {

	float apply(boolean arg) throws ExceptionT;

}
