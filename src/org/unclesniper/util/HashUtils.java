package org.unclesniper.util;

public final class HashUtils {

	public static final int PRIME = 13;

	public static final int NULL = 0;

	private HashUtils() {}

	public static int hash(Object property) {
		return property == null ? HashUtils.NULL : property.hashCode();
	}

	public static int hash(int previous, Object property) {
		return previous * HashUtils.PRIME + (property == null ? HashUtils.NULL : property.hashCode());
	}

	public static int hashCached(Object source, Object cached) {
		if(source != null)
			return source.hashCode();
		return cached == null ? HashUtils.NULL : cached.hashCode();
	}

	public static int hashCached(int previous, Object source, Object cached) {
		if(source != null)
			return previous * HashUtils.PRIME + source.hashCode();
		return previous * HashUtils.PRIME + (cached == null ? HashUtils.NULL : cached.hashCode());
	}

}
