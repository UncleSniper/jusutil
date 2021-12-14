package org.unclesniper.util.collection;

import java.util.Iterator;
import java.util.NoSuchElementException;

import static org.unclesniper.util.ArgUtils.notNull;

public class ArrayIterator<T> implements Iterator<T> {

	private final T[] array;

	private int nextIndex;

	public ArrayIterator(T[] array) {
		this.array = notNull(array, "array");
	}

	@Override
	public boolean hasNext() {
		return nextIndex < array.length;
	}

	@Override
	public T next() {
		if(nextIndex >= array.length)
			throw new NoSuchElementException();
		return array[nextIndex++];
	}

}
