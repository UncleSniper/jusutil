package org.unclesniper.util.j8;

public interface ThrowingDoubleSink<ExceptionT extends Throwable> {

	void putDouble(double value) throws ExceptionT;

}
