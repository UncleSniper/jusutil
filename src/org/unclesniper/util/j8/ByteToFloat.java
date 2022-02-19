package org.unclesniper.util.j8;

public interface ByteToFloat extends IOByteToFloat, ThrowingByteToFloat<RuntimeException> {

	@Override
	float apply(byte arg);

}
