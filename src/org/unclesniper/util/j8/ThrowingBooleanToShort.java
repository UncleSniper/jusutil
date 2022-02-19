package org.unclesniper.util.j8;

public interface ThrowingBooleanToShort<ExceptionT extends Throwable> {

	short apply(boolean arg) throws ExceptionT;

}
