package org.unclesniper.util;

import static org.unclesniper.util.ArgUtils.notNull;

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

	public static int hash(int previous, int property) {
		return previous * HashUtils.PRIME + property;
	}

	public static int hash(long property) {
		int hi = (int)(property >>> 32);
		int lo = (int)(property & 0xFFFFFFFFL);
		return hi * HashUtils.PRIME + lo;
	}

	public static int hash(int previous, long property) {
		int hi = (int)(property >>> 32);
		int lo = (int)(property & 0xFFFFFFFFL);
		return (previous * HashUtils.PRIME + hi) * HashUtils.PRIME + lo;
	}

	public static int hash(float property) {
		return Float.floatToIntBits(property);
	}

	public static int hash(int previous, float property) {
		return previous * HashUtils.PRIME + Float.floatToIntBits(property);
	}

	public static int hash(double property) {
		long bits = Double.doubleToLongBits(property);
		int hi = (int)(bits >>> 32);
		int lo = (int)(bits & 0xFFFFFFFFL);
		return hi * HashUtils.PRIME + lo;
	}

	public static int hash(int previous, double property) {
		long bits = Double.doubleToLongBits(property);
		int hi = (int)(bits >>> 32);
		int lo = (int)(bits & 0xFFFFFFFFL);
		return (previous * HashUtils.PRIME + hi) * HashUtils.PRIME + lo;
	}

	public static int hash(boolean property) {
		return property ? 1 : 0;
	}

	public static int hash(int previous, boolean property) {
		return previous * 3 + (property ? 1 : 0);
	}

	public static int hashAll(int previous, Object... properties) {
		for(Object property : notNull(properties, "properties"))
			previous = previous * HashUtils.PRIME + (property == null ? HashUtils.NULL : property.hashCode());
		return previous;
	}

	public static int hashAll(int previous, int... properties) {
		for(int property : notNull(properties, "properties"))
			previous = previous * HashUtils.PRIME + property;
		return previous;
	}

	public static int hashAll(int previous, long... properties) {
		for(long property : notNull(properties, "properties")) {
			int hi = (int)(property >>> 32);
			int lo = (int)(property & 0xFFFFFFFFL);
			previous = (previous * HashUtils.PRIME + hi) * HashUtils.PRIME + lo;
		}
		return previous;
	}

	public static int hashAll(int previous, float... properties) {
		for(float property : notNull(properties, "properties"))
			previous = previous * HashUtils.PRIME + Float.floatToIntBits(property);
		return previous;
	}

	public static int hashAll(int previous, double... properties) {
		for(double property : notNull(properties, "properties")) {
			long bits = Double.doubleToLongBits(property);
			int hi = (int)(bits >>> 32);
			int lo = (int)(bits & 0xFFFFFFFFL);
			previous = (previous * HashUtils.PRIME + hi) * HashUtils.PRIME + lo;
		}
		return previous;
	}

	public static int hashAll(int previous, boolean... properties) {
		int length = notNull(properties, "properties").length;
		int buckets = length / 32;
		int index = 0;
		for(int bucket = 0; bucket < buckets; ++bucket) {
			int bits = 0;
			for(int bit = 0; bit < 32; ++bit)
				bits = (bits << 1) | (properties[index++] ? 1 : 0);
			previous = previous * HashUtils.PRIME + bits;
		}
		int rest = length % 32;
		if(rest > 0) {
			int bits = 0;
			for(int bit = 0; bit < rest; ++bit)
				bits = (bits << 1) | (properties[index++] ? 1 : 0);
			previous = previous * HashUtils.PRIME + bits;
		}
		return previous;
	}

}
