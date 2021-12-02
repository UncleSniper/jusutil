package org.unclesniper.util.j8;

public interface ObjectIterable<ElementT> extends IOObjectIterable<ElementT> {

	@Override
	ObjectIterator<ElementT> objectIterator();

}
