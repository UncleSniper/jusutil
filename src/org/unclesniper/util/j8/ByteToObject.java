package org.unclesniper.util.j8;

public interface ByteToObject<ReturnT>
		extends IOByteToObject<ReturnT>, ThrowingByteToObject<ReturnT, RuntimeException> {

	@Override
	ReturnT apply(byte arg);

}
