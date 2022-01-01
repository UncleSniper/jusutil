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
		return a == null || b == null || a.equals(b);
	}

	public static boolean equalIfBothPresent(boolean previous, Object a, Object b) {
		return previous && (a == null || b == null || a.equals(b));
	}

	public static boolean equalIfEitherPresent(Object a, Object b) {
		return a == null ? b == null : b != null && a.equals(b);
	}

	public static boolean equalIfEitherPresent(boolean previous, Object a, Object b) {
		return previous && (a == null ? b == null : b != null && a.equals(b));
	}

	public static CascadingEquality equal(CascadingEquality previous, Object a, Object b) {
		if(previous == CascadingEquality.UNEQUAL)
			return previous;
		if(a == null)
			return b == null ? CascadingEquality.EQUAL : CascadingEquality.UNEQUAL;
		if(b == null)
			return CascadingEquality.UNEQUAL;
		return a.equals(b) ? CascadingEquality.EQUAL : CascadingEquality.UNEQUAL;
	}

	public static CascadingEquality equalIfBothPresent(CascadingEquality previous, Object a, Object b) {
		if(previous == CascadingEquality.UNEQUAL)
			return previous;
		if(a == null || b == null)
			return previous == null ? CascadingEquality.UNKNOWN : previous;
		return a.equals(b) ? CascadingEquality.EQUAL : CascadingEquality.UNEQUAL;
	}

	public static CascadingEquality equalIfEitherPresent(CascadingEquality previous, Object a, Object b) {
		if(previous == CascadingEquality.UNEQUAL)
			return previous;
		if(a == null)
			return b == null ? (previous == null ? CascadingEquality.UNKNOWN : previous) : CascadingEquality.UNEQUAL;
		if(b == null)
			return CascadingEquality.UNEQUAL;
		return a.equals(b) ? CascadingEquality.EQUAL : CascadingEquality.UNEQUAL;
	}

}
