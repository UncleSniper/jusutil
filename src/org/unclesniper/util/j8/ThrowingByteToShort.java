package org.unclesniper.util.j8;

public interface ThrowingByteToShort<ExceptionT extends Throwable> {

	short apply(byte arg) throws ExceptionT;

}
