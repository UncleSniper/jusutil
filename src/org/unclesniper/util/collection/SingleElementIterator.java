package org.unclesniper.util.collection;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class SingleElementIterator<T> implements Iterator<T> {

	private final T element;

	private boolean done;

	public SingleElementIterator(T element) {
		this.element = element;
	}

	@Override
	public boolean hasNext() {
		return !done;
	}

	@Override
	public T next() {
		if(done)
			throw new NoSuchElementException();
		done = true;
		return element;
	}

}
