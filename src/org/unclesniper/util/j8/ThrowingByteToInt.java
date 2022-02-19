package org.unclesniper.util.j8;

public interface ThrowingByteToInt<ExceptionT extends Throwable> {

	int apply(byte arg) throws ExceptionT;

}
