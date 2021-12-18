package org.unclesniper.util.collection;

import java.util.Iterator;

public class EmptyIterable<T> implements Iterable<T> {

	public EmptyIterable() {}

	@Override
	public Iterator<T> iterator() {
		return new EmptyIterator<T>();
	}

}
