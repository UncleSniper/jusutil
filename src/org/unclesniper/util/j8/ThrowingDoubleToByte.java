package org.unclesniper.util.j8;

public interface ThrowingDoubleToByte<ExceptionT extends Throwable> {

	byte apply(double arg) throws ExceptionT;

}
