package org.unclesniper.util.j8;

public interface ByteP extends IOByteP, ThrowingByteP<RuntimeException> {

	@Override
	boolean testByte(byte value);

}
