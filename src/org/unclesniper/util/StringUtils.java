package org.unclesniper.util;

import java.util.regex.Pattern;

import static org.unclesniper.util.ArgUtils.notNull;

public final class StringUtils {

	private static final Pattern WHITESPACE_PATTERN = Pattern.compile("\\s+");

	private StringUtils() {}

	public static String[] splitAtWhitespace(String s) {
		return StringUtils.WHITESPACE_PATTERN.split(notNull(s, "s").trim());
	}

}
