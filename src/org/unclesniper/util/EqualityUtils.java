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

	public static boolean equal(boolean previous, byte a, byte b) {
		return previous && a == b;
	}

	public static CascadingEquality equal(CascadingEquality previous, byte a, byte b) {
		if(previous == CascadingEquality.UNEQUAL)
			return previous;
		return a == b ? CascadingEquality.EQUAL : CascadingEquality.UNEQUAL;
	}

	public static boolean equal(boolean previous, short a, short b) {
		return previous && a == b;
	}

	public static CascadingEquality equal(CascadingEquality previous, short a, short b) {
		if(previous == CascadingEquality.UNEQUAL)
			return previous;
		return a == b ? CascadingEquality.EQUAL : CascadingEquality.UNEQUAL;
	}

	public static boolean equal(boolean previous, int a, int b) {
		return previous && a == b;
	}

	public static CascadingEquality equal(CascadingEquality previous, int a, int b) {
		if(previous == CascadingEquality.UNEQUAL)
			return previous;
		return a == b ? CascadingEquality.EQUAL : CascadingEquality.UNEQUAL;
	}

	public static boolean equal(boolean previous, long a, long b) {
		return previous && a == b;
	}

	public static CascadingEquality equal(CascadingEquality previous, long a, long b) {
		if(previous == CascadingEquality.UNEQUAL)
			return previous;
		return a == b ? CascadingEquality.EQUAL : CascadingEquality.UNEQUAL;
	}

	public static boolean equal(boolean previous, float a, float b) {
		return previous && a == b;
	}

	public static CascadingEquality equal(CascadingEquality previous, float a, float b) {
		if(previous == CascadingEquality.UNEQUAL)
			return previous;
		return a == b ? CascadingEquality.EQUAL : CascadingEquality.UNEQUAL;
	}

	public static boolean equal(boolean previous, double a, double b) {
		return previous && a == b;
	}

	public static CascadingEquality equal(CascadingEquality previous, double a, double b) {
		if(previous == CascadingEquality.UNEQUAL)
			return previous;
		return a == b ? CascadingEquality.EQUAL : CascadingEquality.UNEQUAL;
	}

	public static boolean equal(boolean previous, boolean a, boolean b) {
		return previous && a == b;
	}

	public static CascadingEquality equal(CascadingEquality previous, boolean a, boolean b) {
		if(previous == CascadingEquality.UNEQUAL)
			return previous;
		return a == b ? CascadingEquality.EQUAL : CascadingEquality.UNEQUAL;
	}

	// without condition: beginEqual = equal

	public static CascadingEquality beginEqualIfBothPresent(CascadingEquality previous, Object a, Object b) {
		if(previous == CascadingEquality.UNEQUAL)
			return previous;
		if(a == null || b == null)
			return CascadingEquality.UNKNOWN;
		return a.equals(b) ? CascadingEquality.EQUAL : CascadingEquality.UNEQUAL;
	}

	public static CascadingEquality beginEqualIfEitherPresent(CascadingEquality previous, Object a, Object b) {
		if(previous == CascadingEquality.UNEQUAL)
			return previous;
		if(a == null)
			return b == null ? CascadingEquality.UNKNOWN : CascadingEquality.UNEQUAL;
		if(b == null)
			return CascadingEquality.UNEQUAL;
		return a.equals(b) ? CascadingEquality.EQUAL : CascadingEquality.UNEQUAL;
	}

	public static CascadingEquality endEqual(CascadingEquality previous, Object a, Object b) {
		if(previous != null && previous.decided)
			return previous;
		if(a == null)
			return b == null ? CascadingEquality.EQUAL : CascadingEquality.UNEQUAL;
		if(b == null)
			return CascadingEquality.UNEQUAL;
		return a.equals(b) ? CascadingEquality.EQUAL : CascadingEquality.UNEQUAL;
	}

	public static CascadingEquality endEqualIfBothPresent(CascadingEquality previous, Object a, Object b) {
		if(previous != null && previous.decided)
			return previous;
		if(a == null || b == null)
			return CascadingEquality.UNKNOWN;
		return a.equals(b) ? CascadingEquality.EQUAL : CascadingEquality.UNEQUAL;
	}

	public static CascadingEquality endEqualIfEitherPresent(CascadingEquality previous, Object a, Object b) {
		if(previous != null && previous.decided)
			return previous;
		if(a == null)
			return b == null ? CascadingEquality.UNKNOWN : CascadingEquality.UNEQUAL;
		if(b == null)
			return CascadingEquality.UNEQUAL;
		return a.equals(b) ? CascadingEquality.EQUAL : CascadingEquality.UNEQUAL;
	}

	public static CascadingEquality endEqual(CascadingEquality previous, byte a, byte b) {
		if(previous != null && previous.decided)
			return previous;
		return a == b ? CascadingEquality.EQUAL : CascadingEquality.UNEQUAL;
	}

	public static CascadingEquality endEqual(CascadingEquality previous, short a, short b) {
		if(previous != null && previous.decided)
			return previous;
		return a == b ? CascadingEquality.EQUAL : CascadingEquality.UNEQUAL;
	}

	public static CascadingEquality endEqual(CascadingEquality previous, int a, int b) {
		if(previous != null && previous.decided)
			return previous;
		return a == b ? CascadingEquality.EQUAL : CascadingEquality.UNEQUAL;
	}

	public static CascadingEquality endEqual(CascadingEquality previous, long a, long b) {
		if(previous != null && previous.decided)
			return previous;
		return a == b ? CascadingEquality.EQUAL : CascadingEquality.UNEQUAL;
	}

	public static CascadingEquality endEqual(CascadingEquality previous, float a, float b) {
		if(previous != null && previous.decided)
			return previous;
		return a == b ? CascadingEquality.EQUAL : CascadingEquality.UNEQUAL;
	}

	public static CascadingEquality endEqual(CascadingEquality previous, double a, double b) {
		if(previous != null && previous.decided)
			return previous;
		return a == b ? CascadingEquality.EQUAL : CascadingEquality.UNEQUAL;
	}

	public static CascadingEquality endEqual(CascadingEquality previous, boolean a, boolean b) {
		if(previous != null && previous.decided)
			return previous;
		return a == b ? CascadingEquality.EQUAL : CascadingEquality.UNEQUAL;
	}

	public static CascadingEquality endEqual(CascadingEquality previous) {
		return previous != null && previous.decided ? previous : CascadingEquality.EQUAL;
	}

}
