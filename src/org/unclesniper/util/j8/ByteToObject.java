package org.unclesniper.util.j8;

public interface ByteToObject<ReturnT> extends IOByteToObject<ReturnT> {

	@Override
	ReturnT apply(byte arg);

}
