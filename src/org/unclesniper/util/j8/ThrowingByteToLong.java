package org.unclesniper.util.j8;

interface ThrowingByteToLong<ExceptionT extends Throwable> {

	long apply(byte arg) throws ExceptionT;

}
