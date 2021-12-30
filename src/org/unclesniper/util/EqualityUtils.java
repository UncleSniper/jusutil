package org.unclesniper.util;

import java.util.Objects;

import static org.unclesniper.util.ArgUtils.notNull;

public final class EqualityUtils {

	private EqualityUtils() {}

	public static <T> T compareTo(Object other, Class<T> clazz) {
		return notNull(clazz, "clazz").isInstance(other) ? clazz.cast(other) : null;
	}

	public static boolean equal(boolean previous, Object a, Object b) {
		if(!previous)
			return false;
		return Objects.equals(a, b);
	}

	public static boolean equalIfBothPresent(Object a, Object b) {
		return (a == null && b == null) || Objects.equals(a, b);
	}

	public static boolean equalIfBothPresent(boolean previous, Object a, Object b) {
		if(!previous)
			return false;
		return (a == null && b == null) || Objects.equals(a, b);
	}

}
