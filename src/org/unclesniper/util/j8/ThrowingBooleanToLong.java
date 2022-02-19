package org.unclesniper.util.j8;

public interface ThrowingBooleanToLong<ExceptionT extends Throwable> {

	long apply(boolean arg) throws ExceptionT;

}
