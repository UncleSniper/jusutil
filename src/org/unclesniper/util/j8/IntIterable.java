package org.unclesniper.util.j8;

public interface IntIterable extends IOIntIterable, LongIterable {

	@Override
	IntIterator intIterator();

}
