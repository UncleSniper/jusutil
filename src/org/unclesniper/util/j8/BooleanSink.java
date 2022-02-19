package org.unclesniper.util.j8;

public interface BooleanSink extends IOBooleanSink, ThrowingBooleanSink<RuntimeException> {

	@Override
	void putBoolean(boolean value);

}
