package org.unclesniper.util.j8;

public interface ByteSink extends IOByteSink, ThrowingByteSink<RuntimeException> {

	@Override
	void putByte(byte value);

}
