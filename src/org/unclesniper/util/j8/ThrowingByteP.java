package org.unclesniper.util.j8;

public interface ThrowingByteP<ExceptionT extends Throwable> {

	boolean testByte(byte value) throws ExceptionT;

}
