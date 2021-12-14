package org.unclesniper.util.collection;

import java.util.Iterator;

public class SingleElementIterable<T> implements Iterable<T> {

	private final T element;

	public SingleElementIterable(T element) {
		this.element = element;
	}

	@Override
	public Iterator<T> iterator() {
		return new SingleElementIterator<T>(element);
	}

}
