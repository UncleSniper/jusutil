package org.unclesniper.util.collection;

import java.util.Iterator;

import static org.unclesniper.util.ArgUtils.notNull;

public final class CollectionUtils {

	private CollectionUtils() {}

	public static <T> Iterator<T> iterating(Iterable<T> iterable) {
		return notNull(iterable, "iterable").iterator();
	}

}
