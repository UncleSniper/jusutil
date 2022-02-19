package org.unclesniper.util.j8;

public interface ThrowingByteToBoolean<ExceptionT extends Throwable> {

	boolean apply(byte arg) throws ExceptionT;

}
