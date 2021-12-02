package org.unclesniper.util.j8;

public interface ShortIterable extends IOShortIterable, IntIterable {

	@Override
	ShortIterator shortIterator();

}
