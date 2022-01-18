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
			throw new IllegalArgumentException("Empty string is illegal Java qualified name");
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

	public static boolean isRawTypeName(String name) {
		int length = notNull(name, "name").length(), start = 0;
		if(length == 0)
			return false;
		boolean inArray = false;
		for(;;) {
			int dot = name.indexOf('.', start);
			int bracket = name.indexOf('[', start);
			boolean isBracket;
			if(dot < 0) {
				if(bracket < 0)
					break;
				isBracket = true;
			}
			else
				isBracket = bracket >= 0 && bracket < dot;
			if(isBracket) {
				if(bracket == 0 || bracket == length - 1 || name.charAt(bracket + 1) != ']')
					return false;
				if(inArray) {
					if(bracket != start)
						return false;
				}
				else {
					if(!JavaUtils.isIdentifierInternal(name, start, bracket - start))
						return false;
				}
				inArray = true;
				start = bracket + 2;
			}
			else {
				if(inArray)
					return false;
				if(!JavaUtils.isIdentifierInternal(name, start, dot - start))
					return false;
				start = dot + 1;
			}
		}
		if(inArray)
			return start == length;
		else
			return JavaUtils.isIdentifierInternal(name, start, length - start);
	}

	public static int splitRawTypeName(String name, Consumer<String> sink) {
		int length = notNull(name, "name").length(), start = 0;
		notNull(sink, "sink");
		if(length == 0)
			throw new IllegalArgumentException("Empty string is illegal Java raw type name");
		int arrayDepth = 0;
		for(;;) {
			int dot = name.indexOf('.', start);
			int bracket = name.indexOf('[', start);
			boolean isBracket;
			if(dot < 0) {
				if(bracket < 0)
					break;
				isBracket = true;
			}
			else
				isBracket = bracket >= 0 && bracket < dot;
			if(isBracket) {
				if(bracket == 0 || bracket == length - 1 || name.charAt(bracket + 1) != ']')
					throw new IllegalArgumentException("Illegal Java raw type name: " + name);
				if(arrayDepth > 0) {
					if(bracket != start)
						throw new IllegalArgumentException("Illegal Java raw type name: " + name);
				}
				else {
					if(!JavaUtils.isIdentifierInternal(name, start, bracket - start))
						throw new IllegalArgumentException("Illegal Java raw type name: " + name);
				}
				++arrayDepth;
				start = bracket + 2;
			}
			else {
				if(arrayDepth > 0)
					throw new IllegalArgumentException("Illegal Java raw type name: " + name);
				if(!JavaUtils.isIdentifierInternal(name, start, dot - start))
					throw new IllegalArgumentException("Illegal Java raw type name: " + name);
				sink.accept(name.substring(start, dot));
				start = dot + 1;
			}
		}
		if(arrayDepth > 0) {
			if(start != length)
				throw new IllegalArgumentException("Illegal Java raw type name: " + name);
		}
		else {
			if(!JavaUtils.isIdentifierInternal(name, start, length - start))
				throw new IllegalArgumentException("Illegal Java raw type name: " + name);
			sink.accept(name.substring(start));
		}
		return arrayDepth;
	}

}
