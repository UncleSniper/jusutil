package org.unclesniper.util;

import static org.unclesniper.util.ArgUtils.notNull;
import static org.unclesniper.util.ArgUtils.lengthRangeExclusive;

public final class JavaUtils {

	private JavaUtils() {}

	private static boolean isIdentifierInternal(String name, int offset, int length) {
		lengthRangeExclusive(offset, length, name.length(), "offset", "length");
		int end = offset + length, i;
		for(i = offset; i < end; ++i) {
			char c = name.charAt(i);
			if(!(i == 0 ? Character.isJavaIdentifierStart(c) : Character.isJavaIdentifierPart(c)))
				return false;
		}
		return i > offset;
	}

	public static boolean isIdentifier(String name, int offset, int length) {
		return JavaUtils.isIdentifierInternal(notNull(name, "name"), offset, length);
	}

	public static boolean isIdentifier(String name) {
		return JavaUtils.isIdentifierInternal(notNull(name, "name"), 0, name.length());
	}

	public static boolean isPackageName(String name) {
		int length = notNull(name, "name").length(), start = 0;
		if(length == 0)
			return false;
		for(;;) {
			int pos = name.indexOf('.', start);
			if(pos < 0)
				break;
			if(!JavaUtils.isIdentifierInternal(name, start, pos - start))
				return false;
			start = pos + 1;
		}
		return JavaUtils.isIdentifierInternal(name, start, length - start);
	}

}
