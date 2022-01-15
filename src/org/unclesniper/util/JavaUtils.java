package org.unclesniper.util;

import java.util.function.Consumer;

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

	public static boolean isQualifiedName(String name) {
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

	public static void splitQualifiedName(String name, Consumer<String> sink) {
		int length = notNull(name, "name").length(), start = 0;
		notNull(sink, "sink");
		if(length == 0)
			throw new IllegalArgumentException("Illegal Java qualified name: " + name);
		for(;;) {
			int pos = name.indexOf('.', start);
			if(pos < 0)
				break;
			if(!JavaUtils.isIdentifierInternal(name, start, pos - start))
				throw new IllegalArgumentException("Illegal Java qualified name: " + name);
			sink.accept(name.substring(start, pos));
			start = pos + 1;
		}
		if(!JavaUtils.isIdentifierInternal(name, start, length - start))
			throw new IllegalArgumentException("Illegal Java qualified name: " + name);
		sink.accept(name.substring(start));
	}

}
