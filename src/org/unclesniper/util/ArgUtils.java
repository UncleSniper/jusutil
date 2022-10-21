package org.unclesniper.util;

public final class ArgUtils {

	private ArgUtils() {}

	public static <T> T notNull(T arg, String name) {
		if(name == null)
			throw new IllegalArgumentException("Argument 'name' to ArgUtils.notNull() must not be null");
		if(arg == null)
			throw new IllegalArgumentException("Argument '" + name + "' must not be null");
		return arg;
	}

	public static int positive(int arg, String name) {
		if(name == null)
			throw new IllegalArgumentException("Argument 'name' to ArgUtils.positive() must not be null");
		if(arg <= 0)
			throw new IllegalArgumentException("Argument '" + name + "' must be positive: " + arg);
		return arg;
	}

	public static int notPositive(int arg, String name) {
		if(name == null)
			throw new IllegalArgumentException("Argument 'name' to ArgUtils.notPositive() must not be null");
		if(arg > 0)
			throw new IllegalArgumentException("Argument '" + name + "' must not be positive: " + arg);
		return arg;
	}

	public static int negative(int arg, String name) {
		if(name == null)
			throw new IllegalArgumentException("Argument 'name' to ArgUtils.negative() must not be null");
		if(arg >= 0)
			throw new IllegalArgumentException("Argument '" + name + "' must be negative: " + arg);
		return arg;
	}

	public static int notNegative(int arg, String name) {
		if(name == null)
			throw new IllegalArgumentException("Argument 'name' to ArgUtils.notNegative() must not be null");
		if(arg < 0)
			throw new IllegalArgumentException("Argument '" + name + "' must not be negative: " + arg);
		return arg;
	}

	public static short positive(short arg, String name) {
		if(name == null)
			throw new IllegalArgumentException("Argument 'name' to ArgUtils.positive() must not be null");
		if(arg <= 0)
			throw new IllegalArgumentException("Argument '" + name + "' must be positive: " + arg);
		return arg;
	}

	public static short notPositive(short arg, String name) {
		if(name == null)
			throw new IllegalArgumentException("Argument 'name' to ArgUtils.notPositive() must not be null");
		if(arg > 0)
			throw new IllegalArgumentException("Argument '" + name + "' must not be positive: " + arg);
		return arg;
	}

	public static short negative(short arg, String name) {
		if(name == null)
			throw new IllegalArgumentException("Argument 'name' to ArgUtils.negative() must not be null");
		if(arg >= 0)
			throw new IllegalArgumentException("Argument '" + name + "' must be negative: " + arg);
		return arg;
	}

	public static short notNegative(short arg, String name) {
		if(name == null)
			throw new IllegalArgumentException("Argument 'name' to ArgUtils.notNegative() must not be null");
		if(arg < 0)
			throw new IllegalArgumentException("Argument '" + name + "' must not be negative: " + arg);
		return arg;
	}

	public static byte positive(byte arg, String name) {
		if(name == null)
			throw new IllegalArgumentException("Argument 'name' to ArgUtils.positive() must not be null");
		if(arg <= 0)
			throw new IllegalArgumentException("Argument '" + name + "' must be positive: " + arg);
		return arg;
	}

	public static byte notPositive(byte arg, String name) {
		if(name == null)
			throw new IllegalArgumentException("Argument 'name' to ArgUtils.notPositive() must not be null");
		if(arg > 0)
			throw new IllegalArgumentException("Argument '" + name + "' must not be positive: " + arg);
		return arg;
	}

	public static byte negative(byte arg, String name) {
		if(name == null)
			throw new IllegalArgumentException("Argument 'name' to ArgUtils.negative() must not be null");
		if(arg >= 0)
			throw new IllegalArgumentException("Argument '" + name + "' must be negative: " + arg);
		return arg;
	}

	public static byte notNegative(byte arg, String name) {
		if(name == null)
			throw new IllegalArgumentException("Argument 'name' to ArgUtils.notNegative() must not be null");
		if(arg < 0)
			throw new IllegalArgumentException("Argument '" + name + "' must not be negative: " + arg);
		return arg;
	}

	public static long positive(long arg, String name) {
		if(name == null)
			throw new IllegalArgumentException("Argument 'name' to ArgUtils.positive() must not be null");
		if(arg <= 0)
			throw new IllegalArgumentException("Argument '" + name + "' must be positive: " + arg);
		return arg;
	}

	public static long notPositive(long arg, String name) {
		if(name == null)
			throw new IllegalArgumentException("Argument 'name' to ArgUtils.notPositive() must not be null");
		if(arg > 0)
			throw new IllegalArgumentException("Argument '" + name + "' must not be positive: " + arg);
		return arg;
	}

	public static long negative(long arg, String name) {
		if(name == null)
			throw new IllegalArgumentException("Argument 'name' to ArgUtils.negative() must not be null");
		if(arg >= 0)
			throw new IllegalArgumentException("Argument '" + name + "' must be negative: " + arg);
		return arg;
	}

	public static long notNegative(long arg, String name) {
		if(name == null)
			throw new IllegalArgumentException("Argument 'name' to ArgUtils.notNegative() must not be null");
		if(arg < 0)
			throw new IllegalArgumentException("Argument '" + name + "' must not be negative: " + arg);
		return arg;
	}

	public static float positive(float arg, String name) {
		if(name == null)
			throw new IllegalArgumentException("Argument 'name' to ArgUtils.positive() must not be null");
		if(arg <= 0)
			throw new IllegalArgumentException("Argument '" + name + "' must be positive: " + arg);
		return arg;
	}

	public static float notPositive(float arg, String name) {
		if(name == null)
			throw new IllegalArgumentException("Argument 'name' to ArgUtils.notPositive() must not be null");
		if(arg > 0)
			throw new IllegalArgumentException("Argument '" + name + "' must not be positive: " + arg);
		return arg;
	}

	public static float negative(float arg, String name) {
		if(name == null)
			throw new IllegalArgumentException("Argument 'name' to ArgUtils.negative() must not be null");
		if(arg >= 0)
			throw new IllegalArgumentException("Argument '" + name + "' must be negative: " + arg);
		return arg;
	}

	public static float notNegative(float arg, String name) {
		if(name == null)
			throw new IllegalArgumentException("Argument 'name' to ArgUtils.notNegative() must not be null");
		if(arg < 0)
			throw new IllegalArgumentException("Argument '" + name + "' must not be negative: " + arg);
		return arg;
	}

	public static double positive(double arg, String name) {
		if(name == null)
			throw new IllegalArgumentException("Argument 'name' to ArgUtils.positive() must not be null");
		if(arg <= 0)
			throw new IllegalArgumentException("Argument '" + name + "' must be positive: " + arg);
		return arg;
	}

	public static double notPositive(double arg, String name) {
		if(name == null)
			throw new IllegalArgumentException("Argument 'name' to ArgUtils.notPositive() must not be null");
		if(arg > 0)
			throw new IllegalArgumentException("Argument '" + name + "' must not be positive: " + arg);
		return arg;
	}

	public static double negative(double arg, String name) {
		if(name == null)
			throw new IllegalArgumentException("Argument 'name' to ArgUtils.negative() must not be null");
		if(arg >= 0)
			throw new IllegalArgumentException("Argument '" + name + "' must be negative: " + arg);
		return arg;
	}

	public static double notNegative(double arg, String name) {
		if(name == null)
			throw new IllegalArgumentException("Argument 'name' to ArgUtils.notNegative() must not be null");
		if(arg < 0)
			throw new IllegalArgumentException("Argument '" + name + "' must not be negative: " + arg);
		return arg;
	}

	public static int indexExclusive(int arg, int upperBound, String name) {
		if(name == null)
			throw new IllegalArgumentException("Argument 'name' to ArgUtils.indexExclusive() must not be null");
		if(arg < 0)
			throw new IndexOutOfBoundsException("Argument '" + name + "' is out of bounds: " + arg + " < 0");
		if(arg >= upperBound)
			throw new IndexOutOfBoundsException("Argument '" + name + "' is out of bounds: "
					+ arg + " >= " + upperBound);
		return arg;
	}

	public static int indexInclusive(int arg, int upperBound, String name) {
		if(name == null)
			throw new IllegalArgumentException("Argument 'name' to ArgUtils.indexInclusive() must not be null");
		if(arg < 0)
			throw new IndexOutOfBoundsException("Argument '" + name + "' is out of bounds: " + arg + " < 0");
		if(arg > upperBound)
			throw new IndexOutOfBoundsException("Argument '" + name + "' is out of bounds: "
					+ arg + " > " + upperBound);
		return arg;
	}

	public static short indexExclusive(short arg, short upperBound, String name) {
		if(name == null)
			throw new IllegalArgumentException("Argument 'name' to ArgUtils.indexExclusive() must not be null");
		if(arg < 0)
			throw new IndexOutOfBoundsException("Argument '" + name + "' is out of bounds: " + arg + " < 0");
		if(arg >= upperBound)
			throw new IndexOutOfBoundsException("Argument '" + name + "' is out of bounds: "
					+ arg + " >= " + upperBound);
		return arg;
	}

	public static short indexInclusive(short arg, short upperBound, String name) {
		if(name == null)
			throw new IllegalArgumentException("Argument 'name' to ArgUtils.indexInclusive() must not be null");
		if(arg < 0)
			throw new IndexOutOfBoundsException("Argument '" + name + "' is out of bounds: " + arg + " < 0");
		if(arg > upperBound)
			throw new IndexOutOfBoundsException("Argument '" + name + "' is out of bounds: "
					+ arg + " > " + upperBound);
		return arg;
	}

	public static byte indexExclusive(byte arg, byte upperBound, String name) {
		if(name == null)
			throw new IllegalArgumentException("Argument 'name' to ArgUtils.indexExclusive() must not be null");
		if(arg < 0)
			throw new IndexOutOfBoundsException("Argument '" + name + "' is out of bounds: " + arg + " < 0");
		if(arg >= upperBound)
			throw new IndexOutOfBoundsException("Argument '" + name + "' is out of bounds: "
					+ arg + " >= " + upperBound);
		return arg;
	}

	public static byte indexInclusive(byte arg, byte upperBound, String name) {
		if(name == null)
			throw new IllegalArgumentException("Argument 'name' to ArgUtils.indexInclusive() must not be null");
		if(arg < 0)
			throw new IndexOutOfBoundsException("Argument '" + name + "' is out of bounds: " + arg + " < 0");
		if(arg > upperBound)
			throw new IndexOutOfBoundsException("Argument '" + name + "' is out of bounds: "
					+ arg + " > " + upperBound);
		return arg;
	}

	public static long indexExclusive(long arg, long upperBound, String name) {
		if(name == null)
			throw new IllegalArgumentException("Argument 'name' to ArgUtils.indexExclusive() must not be null");
		if(arg < 0)
			throw new IndexOutOfBoundsException("Argument '" + name + "' is out of bounds: " + arg + " < 0");
		if(arg >= upperBound)
			throw new IndexOutOfBoundsException("Argument '" + name + "' is out of bounds: "
					+ arg + " >= " + upperBound);
		return arg;
	}

	public static long indexInclusive(long arg, long upperBound, String name) {
		if(name == null)
			throw new IllegalArgumentException("Argument 'name' to ArgUtils.indexInclusive() must not be null");
		if(arg < 0)
			throw new IndexOutOfBoundsException("Argument '" + name + "' is out of bounds: " + arg + " < 0");
		if(arg > upperBound)
			throw new IndexOutOfBoundsException("Argument '" + name + "' is out of bounds: "
					+ arg + " > " + upperBound);
		return arg;
	}

	public static void lengthRangeExclusive(int offset, int length, int upperBound,
			String offsetName, String lengthName) {
		if(offsetName == null)
			throw new IllegalArgumentException("Argument 'offsetName' to ArgUtils.lengthRangeExclusive() "
					+ "must not be null");
		if(lengthName == null)
			throw new IllegalArgumentException("Argument 'lengthName' to ArgUtils.lengthRangeExclusive() "
					+ "must not be null");
		if(offset < 0)
			throw new IndexOutOfBoundsException("Argument '" + offsetName + "' is out of bounds: "
					+ offset + " < 0");
		if(offset >= upperBound)
			throw new IndexOutOfBoundsException("Argument '" + offsetName + "' is out of bounds: "
					+ offset + " >= " + upperBound);
		if(length < 0)
			throw new IndexOutOfBoundsException("Argument '" + lengthName + "' is out of bounds: "
					+ length + " < 0");
		if(offset + length >= upperBound)
			throw new IndexOutOfBoundsException("End of range '" + offsetName + "..+" + lengthName
					+ "' is out of bounds: " + offset + " + " + length + " >= " + upperBound);
	}

	public static void lengthRangeInclusive(int offset, int length, int upperBound,
			String offsetName, String lengthName) {
		if(offsetName == null)
			throw new IllegalArgumentException("Argument 'offsetName' to ArgUtils.lengthRangeInclusive() "
					+ "must not be null");
		if(lengthName == null)
			throw new IllegalArgumentException("Argument 'lengthName' to ArgUtils.lengthRangeInclusive() "
					+ "must not be null");
		if(offset < 0)
			throw new IndexOutOfBoundsException("Argument '" + offsetName + "' is out of bounds: "
					+ offset + " < 0");
		if(offset > upperBound)
			throw new IndexOutOfBoundsException("Argument '" + offsetName + "' is out of bounds: "
					+ offset + " > " + upperBound);
		if(length < 0)
			throw new IndexOutOfBoundsException("Argument '" + lengthName + "' is out of bounds: "
					+ length + " < 0");
		if(offset + length > upperBound)
			throw new IndexOutOfBoundsException("End of range '" + offsetName + "...+" + lengthName
					+ "' is out of bounds: " + offset + " + " + length + " > " + upperBound);
	}

	public static void endRangeExclusive(int start, int end, int upperBound, String startName, String endName) {
		if(startName == null)
			throw new IllegalArgumentException("Argument 'startName' to ArgUtils.endRangeExclusive() "
					+ "must not be null");
		if(endName == null)
			throw new IllegalArgumentException("Argument 'endName' to ArgUtils.endRangeExclusive() "
					+ "must not be null");
		if(start < 0)
			throw new IndexOutOfBoundsException("Argument '" + startName + "' is out of bounds: "
					+ start + " < 0");
		if(start >= upperBound)
			throw new IndexOutOfBoundsException("Argument '" + startName + "' is out of bounds: "
					+ start + " >= " + upperBound);
		if(end < 0)
			throw new IndexOutOfBoundsException("Argument '" + endName + "' is out of bounds : "
					+ end + " < 0");
		if(end >= upperBound)
			throw new IndexOutOfBoundsException("Argument '" + endName + "' is out of bounds: "
					+ end + " >= " + upperBound);
		if(end < start)
			throw new IndexOutOfBoundsException("Range '" + startName + ".." + endName + "' has negative size: "
					+ start + " > " + end);
	}

	public static void endRangeInclusive(int start, int end, int upperBound, String startName, String endName) {
		if(startName == null)
			throw new IllegalArgumentException("Argument 'startName' to ArgUtils.endRangeInclusive() "
					+ "must not be null");
		if(endName == null)
			throw new IllegalArgumentException("Argument 'endName' to ArgUtils.endRangeInclusive() "
					+ "must not be null");
		if(start < 0)
			throw new IndexOutOfBoundsException("Argument '" + startName + "' is out of bounds: "
					+ start + " < 0");
		if(start > upperBound)
			throw new IndexOutOfBoundsException("Argument '" + startName + "' is out of bounds: "
					+ start + " > " + upperBound);
		if(end < 0)
			throw new IndexOutOfBoundsException("Argument '" + endName + "' is out of bounds : "
					+ end + " < 0");
		if(end > upperBound)
			throw new IndexOutOfBoundsException("Argument '" + endName + "' is out of bounds: "
					+ end + " > " + upperBound);
		if(end < start)
			throw new IndexOutOfBoundsException("Range '" + startName + ".." + endName + "' has negative size: "
					+ start + " > " + end);
	}

	public static void lengthRangeExclusive(short offset, short length, short upperBound,
			String offsetName, String lengthName) {
		if(offsetName == null)
			throw new IllegalArgumentException("Argument 'offsetName' to ArgUtils.lengthRangeExclusive() "
					+ "must not be null");
		if(lengthName == null)
			throw new IllegalArgumentException("Argument 'lengthName' to ArgUtils.lengthRangeExclusive() "
					+ "must not be null");
		if(offset < 0)
			throw new IndexOutOfBoundsException("Argument '" + offsetName + "' is out of bounds: "
					+ offset + " < 0");
		if(offset >= upperBound)
			throw new IndexOutOfBoundsException("Argument '" + offsetName + "' is out of bounds: "
					+ offset + " >= " + upperBound);
		if(length < 0)
			throw new IndexOutOfBoundsException("Argument '" + lengthName + "' is out of bounds: "
					+ length + " < 0");
		if(offset + length >= upperBound)
			throw new IndexOutOfBoundsException("End of range '" + offsetName + "..+" + lengthName
					+ "' is out of bounds: " + offset + " + " + length + " >= " + upperBound);
	}

	public static void lengthRangeInclusive(short offset, short length, short upperBound,
			String offsetName, String lengthName) {
		if(offsetName == null)
			throw new IllegalArgumentException("Argument 'offsetName' to ArgUtils.lengthRangeInclusive() "
					+ "must not be null");
		if(lengthName == null)
			throw new IllegalArgumentException("Argument 'lengthName' to ArgUtils.lengthRangeInclusive() "
					+ "must not be null");
		if(offset < 0)
			throw new IndexOutOfBoundsException("Argument '" + offsetName + "' is out of bounds: "
					+ offset + " < 0");
		if(offset > upperBound)
			throw new IndexOutOfBoundsException("Argument '" + offsetName + "' is out of bounds: "
					+ offset + " > " + upperBound);
		if(length < 0)
			throw new IndexOutOfBoundsException("Argument '" + lengthName + "' is out of bounds: "
					+ length + " < 0");
		if(offset + length > upperBound)
			throw new IndexOutOfBoundsException("End of range '" + offsetName + "...+" + lengthName
					+ "' is out of bounds: " + offset + " + " + length + " > " + upperBound);
	}

	public static void endRangeExclusive(short start, short end, short upperBound, String startName, String endName) {
		if(startName == null)
			throw new IllegalArgumentException("Argument 'startName' to ArgUtils.endRangeExclusive() "
					+ "must not be null");
		if(endName == null)
			throw new IllegalArgumentException("Argument 'endName' to ArgUtils.endRangeExclusive() "
					+ "must not be null");
		if(start < 0)
			throw new IndexOutOfBoundsException("Argument '" + startName + "' is out of bounds: "
					+ start + " < 0");
		if(start >= upperBound)
			throw new IndexOutOfBoundsException("Argument '" + startName + "' is out of bounds: "
					+ start + " >= " + upperBound);
		if(end < 0)
			throw new IndexOutOfBoundsException("Argument '" + endName + "' is out of bounds : "
					+ end + " < 0");
		if(end >= upperBound)
			throw new IndexOutOfBoundsException("Argument '" + endName + "' is out of bounds: "
					+ end + " >= " + upperBound);
		if(end < start)
			throw new IndexOutOfBoundsException("Range '" + startName + ".." + endName + "' has negative size: "
					+ start + " > " + end);
	}

	public static void endRangeInclusive(short start, short end, short upperBound, String startName, String endName) {
		if(startName == null)
			throw new IllegalArgumentException("Argument 'startName' to ArgUtils.endRangeInclusive() "
					+ "must not be null");
		if(endName == null)
			throw new IllegalArgumentException("Argument 'endName' to ArgUtils.endRangeInclusive() "
					+ "must not be null");
		if(start < 0)
			throw new IndexOutOfBoundsException("Argument '" + startName + "' is out of bounds: "
					+ start + " < 0");
		if(start > upperBound)
			throw new IndexOutOfBoundsException("Argument '" + startName + "' is out of bounds: "
					+ start + " > " + upperBound);
		if(end < 0)
			throw new IndexOutOfBoundsException("Argument '" + endName + "' is out of bounds : "
					+ end + " < 0");
		if(end > upperBound)
			throw new IndexOutOfBoundsException("Argument '" + endName + "' is out of bounds: "
					+ end + " > " + upperBound);
		if(end < start)
			throw new IndexOutOfBoundsException("Range '" + startName + ".." + endName + "' has negative size: "
					+ start + " > " + end);
	}

	public static void lengthRangeExclusive(byte offset, byte length, byte upperBound,
			String offsetName, String lengthName) {
		if(offsetName == null)
			throw new IllegalArgumentException("Argument 'offsetName' to ArgUtils.lengthRangeExclusive() "
					+ "must not be null");
		if(lengthName == null)
			throw new IllegalArgumentException("Argument 'lengthName' to ArgUtils.lengthRangeExclusive() "
					+ "must not be null");
		if(offset < 0)
			throw new IndexOutOfBoundsException("Argument '" + offsetName + "' is out of bounds: "
					+ offset + " < 0");
		if(offset >= upperBound)
			throw new IndexOutOfBoundsException("Argument '" + offsetName + "' is out of bounds: "
					+ offset + " >= " + upperBound);
		if(length < 0)
			throw new IndexOutOfBoundsException("Argument '" + lengthName + "' is out of bounds: "
					+ length + " < 0");
		if(offset + length >= upperBound)
			throw new IndexOutOfBoundsException("End of range '" + offsetName + "..+" + lengthName
					+ "' is out of bounds: " + offset + " + " + length + " >= " + upperBound);
	}

	public static void lengthRangeInclusive(byte offset, byte length, byte upperBound,
			String offsetName, String lengthName) {
		if(offsetName == null)
			throw new IllegalArgumentException("Argument 'offsetName' to ArgUtils.lengthRangeInclusive() "
					+ "must not be null");
		if(lengthName == null)
			throw new IllegalArgumentException("Argument 'lengthName' to ArgUtils.lengthRangeInclusive() "
					+ "must not be null");
		if(offset < 0)
			throw new IndexOutOfBoundsException("Argument '" + offsetName + "' is out of bounds: "
					+ offset + " < 0");
		if(offset > upperBound)
			throw new IndexOutOfBoundsException("Argument '" + offsetName + "' is out of bounds: "
					+ offset + " > " + upperBound);
		if(length < 0)
			throw new IndexOutOfBoundsException("Argument '" + lengthName + "' is out of bounds: "
					+ length + " < 0");
		if(offset + length > upperBound)
			throw new IndexOutOfBoundsException("End of range '" + offsetName + "...+" + lengthName
					+ "' is out of bounds: " + offset + " + " + length + " > " + upperBound);
	}

	public static void endRangeExclusive(byte start, byte end, byte upperBound, String startName, String endName) {
		if(startName == null)
			throw new IllegalArgumentException("Argument 'startName' to ArgUtils.endRangeExclusive() "
					+ "must not be null");
		if(endName == null)
			throw new IllegalArgumentException("Argument 'endName' to ArgUtils.endRangeExclusive() "
					+ "must not be null");
		if(start < 0)
			throw new IndexOutOfBoundsException("Argument '" + startName + "' is out of bounds: "
					+ start + " < 0");
		if(start >= upperBound)
			throw new IndexOutOfBoundsException("Argument '" + startName + "' is out of bounds: "
					+ start + " >= " + upperBound);
		if(end < 0)
			throw new IndexOutOfBoundsException("Argument '" + endName + "' is out of bounds : "
					+ end + " < 0");
		if(end >= upperBound)
			throw new IndexOutOfBoundsException("Argument '" + endName + "' is out of bounds: "
					+ end + " >= " + upperBound);
		if(end < start)
			throw new IndexOutOfBoundsException("Range '" + startName + ".." + endName + "' has negative size: "
					+ start + " > " + end);
	}

	public static void endRangeInclusive(byte start, byte end, byte upperBound, String startName, String endName) {
		if(startName == null)
			throw new IllegalArgumentException("Argument 'startName' to ArgUtils.endRangeInclusive() "
					+ "must not be null");
		if(endName == null)
			throw new IllegalArgumentException("Argument 'endName' to ArgUtils.endRangeInclusive() "
					+ "must not be null");
		if(start < 0)
			throw new IndexOutOfBoundsException("Argument '" + startName + "' is out of bounds: "
					+ start + " < 0");
		if(start > upperBound)
			throw new IndexOutOfBoundsException("Argument '" + startName + "' is out of bounds: "
					+ start + " > " + upperBound);
		if(end < 0)
			throw new IndexOutOfBoundsException("Argument '" + endName + "' is out of bounds : "
					+ end + " < 0");
		if(end > upperBound)
			throw new IndexOutOfBoundsException("Argument '" + endName + "' is out of bounds: "
					+ end + " > " + upperBound);
		if(end < start)
			throw new IndexOutOfBoundsException("Range '" + startName + ".." + endName + "' has negative size: "
					+ start + " > " + end);
	}

	public static void lengthRangeExclusive(long offset, long length, long upperBound,
			String offsetName, String lengthName) {
		if(offsetName == null)
			throw new IllegalArgumentException("Argument 'offsetName' to ArgUtils.lengthRangeExclusive() "
					+ "must not be null");
		if(lengthName == null)
			throw new IllegalArgumentException("Argument 'lengthName' to ArgUtils.lengthRangeExclusive() "
					+ "must not be null");
		if(offset < 0)
			throw new IndexOutOfBoundsException("Argument '" + offsetName + "' is out of bounds: "
					+ offset + " < 0");
		if(offset >= upperBound)
			throw new IndexOutOfBoundsException("Argument '" + offsetName + "' is out of bounds: "
					+ offset + " >= " + upperBound);
		if(length < 0)
			throw new IndexOutOfBoundsException("Argument '" + lengthName + "' is out of bounds: "
					+ length + " < 0");
		if(offset + length >= upperBound)
			throw new IndexOutOfBoundsException("End of range '" + offsetName + "..+" + lengthName
					+ "' is out of bounds: " + offset + " + " + length + " >= " + upperBound);
	}

	public static void lengthRangeInclusive(long offset, long length, long upperBound,
			String offsetName, String lengthName) {
		if(offsetName == null)
			throw new IllegalArgumentException("Argument 'offsetName' to ArgUtils.lengthRangeInclusive() "
					+ "must not be null");
		if(lengthName == null)
			throw new IllegalArgumentException("Argument 'lengthName' to ArgUtils.lengthRangeInclusive() "
					+ "must not be null");
		if(offset < 0)
			throw new IndexOutOfBoundsException("Argument '" + offsetName + "' is out of bounds: "
					+ offset + " < 0");
		if(offset > upperBound)
			throw new IndexOutOfBoundsException("Argument '" + offsetName + "' is out of bounds: "
					+ offset + " > " + upperBound);
		if(length < 0)
			throw new IndexOutOfBoundsException("Argument '" + lengthName + "' is out of bounds: "
					+ length + " < 0");
		if(offset + length > upperBound)
			throw new IndexOutOfBoundsException("End of range '" + offsetName + "...+" + lengthName
					+ "' is out of bounds: " + offset + " + " + length + " > " + upperBound);
	}

	public static void endRangeExclusive(long start, long end, long upperBound, String startName, String endName) {
		if(startName == null)
			throw new IllegalArgumentException("Argument 'startName' to ArgUtils.endRangeExclusive() "
					+ "must not be null");
		if(endName == null)
			throw new IllegalArgumentException("Argument 'endName' to ArgUtils.endRangeExclusive() "
					+ "must not be null");
		if(start < 0)
			throw new IndexOutOfBoundsException("Argument '" + startName + "' is out of bounds: "
					+ start + " < 0");
		if(start >= upperBound)
			throw new IndexOutOfBoundsException("Argument '" + startName + "' is out of bounds: "
					+ start + " >= " + upperBound);
		if(end < 0)
			throw new IndexOutOfBoundsException("Argument '" + endName + "' is out of bounds : "
					+ end + " < 0");
		if(end >= upperBound)
			throw new IndexOutOfBoundsException("Argument '" + endName + "' is out of bounds: "
					+ end + " >= " + upperBound);
		if(end < start)
			throw new IndexOutOfBoundsException("Range '" + startName + ".." + endName + "' has negative size: "
					+ start + " > " + end);
	}

	public static void endRangeInclusive(long start, long end, long upperBound, String startName, String endName) {
		if(startName == null)
			throw new IllegalArgumentException("Argument 'startName' to ArgUtils.endRangeInclusive() "
					+ "must not be null");
		if(endName == null)
			throw new IllegalArgumentException("Argument 'endName' to ArgUtils.endRangeInclusive() "
					+ "must not be null");
		if(start < 0)
			throw new IndexOutOfBoundsException("Argument '" + startName + "' is out of bounds: "
					+ start + " < 0");
		if(start > upperBound)
			throw new IndexOutOfBoundsException("Argument '" + startName + "' is out of bounds: "
					+ start + " > " + upperBound);
		if(end < 0)
			throw new IndexOutOfBoundsException("Argument '" + endName + "' is out of bounds : "
					+ end + " < 0");
		if(end > upperBound)
			throw new IndexOutOfBoundsException("Argument '" + endName + "' is out of bounds: "
					+ end + " > " + upperBound);
		if(end < start)
			throw new IndexOutOfBoundsException("Range '" + startName + ".." + endName + "' has negative size: "
					+ start + " > " + end);
	}

	public static byte safePlus(byte a, byte b, String messageHead) {
		ArgUtils.notNull(messageHead, "messageHead");
		int result = a + b;
		if(result > 127)
			throw new ArithmeticOverflowException(messageHead + ": " + (int)a + " + " + (int)b + " > 127");
		else if(result < -128)
			throw new ArithmeticUnderflowException(messageHead + ": " + (int)a + " + " + (int)b + " < -128");
		return (byte)result;
	}

	public static short safePlus(short a, short b, String messageHead) {
		ArgUtils.notNull(messageHead, "messageHead");
		int result = a + b;
		if(result > 32767)
			throw new ArithmeticOverflowException(messageHead + ": " + (int)a + " + " + (int)b + " > 32767");
		else if(result < -32768)
			throw new ArithmeticUnderflowException(messageHead + ": " + (int)a + " + " + (int)b + " < -32768");
		return (short)result;
	}

	public static int safePlus(int a, int b, String messageHead) {
		ArgUtils.notNull(messageHead, "messageHead");
		if(b >= 0) {
			if(a >= Integer.MAX_VALUE - b)
				throw new ArithmeticOverflowException(messageHead + ": " + a + " + " + b + " > " + Integer.MAX_VALUE);
		}
		else {
			if(a < Integer.MIN_VALUE - b)
				throw new ArithmeticUnderflowException(messageHead + ": " + a + " + " + b + " < " + Integer.MIN_VALUE);
		}
		return a + b;
	}

	public static long safePlus(long a, long b, String messageHead) {
		ArgUtils.notNull(messageHead, "messageHead");
		if(b >= 0) {
			if(a >= Long.MAX_VALUE - b)
				throw new ArithmeticOverflowException(messageHead + ": " + a + " + " + b + " > " + Long.MAX_VALUE);
		}
		else {
			if(a < Long.MIN_VALUE - b)
				throw new ArithmeticUnderflowException(messageHead + ": " + a + " + " + b + " < " + Long.MIN_VALUE);
		}
		return a + b;
	}

}
