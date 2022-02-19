package org.unclesniper.util.j8;

public interface ThrowingByteToByte<ExceptionT extends Throwable> {

	byte apply(byte arg) throws ExceptionT;

}
