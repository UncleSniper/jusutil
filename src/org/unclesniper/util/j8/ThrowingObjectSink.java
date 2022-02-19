package org.unclesniper.util.j8;

public interface ThrowingObjectSink<ValueT, ExceptionT extends Throwable> {

	void putObject(ValueT value) throws ExceptionT;

}
