package org.unclesniper.util.j8;

public interface ObjectSink<ValueT> extends IOObjectSink<ValueT>, ThrowingObjectSink<ValueT, RuntimeException> {

	@Override
	void putObject(ValueT value);

}
