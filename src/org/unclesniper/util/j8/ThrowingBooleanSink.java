package org.unclesniper.util.j8;

public interface ThrowingBooleanSink<ExceptionT extends Throwable> {

	void putBoolean(boolean value) throws ExceptionT;

}
