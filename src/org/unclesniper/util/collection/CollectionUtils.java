package org.unclesniper.util.collection;

import java.util.Map;
import java.util.Iterator;

import static org.unclesniper.util.ArgUtils.notNull;

public final class CollectionUtils {

	private CollectionUtils() {}

	public static <T> Iterator<T> iterating(Iterable<T> iterable) {
		return notNull(iterable, "iterable").iterator();
	}

	public static <K, V> Iterator<K> iteratingKeys(Map<K, V> map) {
		return notNull(map, "map").keySet().iterator();
	}

	public static <K, V> Iterator<V> iteratingValues(Map<K, V> map) {
		return notNull(map, "map").values().iterator();
	}

	public static <K, V> Iterator<Map.Entry<K, V>> iteratingEntries(Map<K, V> map) {
		return notNull(map, "map").entrySet().iterator();
	}

	public static int countNotNull(Iterable<?> collection) {
		int count = 0;
		for(Object element : notNull(collection, "collection")) {
			if(element != null)
				++count;
		}
		return count;
	}

}
