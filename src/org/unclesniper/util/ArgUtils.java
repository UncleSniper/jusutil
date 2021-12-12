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

}
