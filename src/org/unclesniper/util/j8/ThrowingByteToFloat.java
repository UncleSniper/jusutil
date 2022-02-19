package org.unclesniper.util.j8;

public interface ThrowingByteToFloat<ExceptionT extends Throwable> {

	float apply(byte arg) throws ExceptionT;

}
