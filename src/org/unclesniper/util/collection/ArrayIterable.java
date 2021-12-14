package org.unclesniper.util.collection;

import java.util.Iterator;

import static org.unclesniper.util.ArgUtils.notNull;

public class ArrayIterable<T> implements Iterable<T> {

	private final T[] array;

	public ArrayIterable(T[] array) {
		this.array = notNull(array, "array");
	}

	@Override
	public Iterator<T> iterator() {
		return new ArrayIterator<T>(array);
	}

}
