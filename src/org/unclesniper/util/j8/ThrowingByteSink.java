package org.unclesniper.util.j8;

public interface ThrowingByteSink<ExceptionT extends Throwable> {

	void putByte(byte value) throws ExceptionT;

}
