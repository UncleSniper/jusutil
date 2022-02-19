package org.unclesniper.util.j8;

public interface ThrowingByteToObject<ReturnT, ExceptionT extends Throwable> {

	ReturnT apply(byte arg) throws ExceptionT;

}
