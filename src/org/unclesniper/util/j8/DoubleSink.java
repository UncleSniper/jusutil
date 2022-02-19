package org.unclesniper.util.j8;

public interface DoubleSink extends IODoubleSink, ThrowingDoubleSink<RuntimeException> {

	@Override
	void putDouble(double value);

}
