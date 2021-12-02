package org.unclesniper.util.j8;

public interface ByteIterable extends IOByteIterable, ShortIterable {

	@Override
	ByteIterator byteIterator();

}
