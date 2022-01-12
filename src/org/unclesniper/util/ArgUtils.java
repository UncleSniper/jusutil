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

}
