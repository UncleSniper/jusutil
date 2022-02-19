package org.unclesniper.util.j8;

public interface ThrowingByteToDouble<ExceptionT extends Throwable> {

	double apply(byte arg) throws ExceptionT;

}
