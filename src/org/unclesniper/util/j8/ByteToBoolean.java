package org.unclesniper.util.j8;

public interface ByteToBoolean extends IOByteToBoolean, ThrowingByteToBoolean<RuntimeException> {

	@Override
	boolean apply(byte arg);

}
