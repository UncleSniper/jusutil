package org.unclesniper.util;

import java.io.Reader;
import java.io.Writer;
import java.io.InputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.io.InputStreamReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;

import static org.unclesniper.util.ArgUtils.notNull;
import static org.unclesniper.util.ArgUtils.notNegative;

public final class IOUtils {

	public static final String DEFAULT_INDENT = "    ";

	private IOUtils() {}

	public static long copy(InputStream in, OutputStream out) throws IOException {
		notNull(in, "in");
		notNull(out, "out");
		long all = 0L;
		byte[] buffer = new byte[512];
		for(;;) {
			int count = in.read(buffer);
			if(count <= 0)
				break;
			out.write(buffer, 0, count);
			all += count;
		}
		return all;
	}

	public static long copy(Reader in, Writer out) throws IOException {
		notNull(in, "in");
		notNull(out, "out");
		long all = 0L;
		char[] buffer = new char[512];
		for(;;) {
			int count = in.read(buffer);
			if(count <= 0)
				break;
			out.write(buffer, 0, count);
			all += count;
		}
		return all;
	}

	public static byte[] toByteArray(InputStream in) throws IOException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		IOUtils.copy(in, baos);
		return baos.toByteArray();
	}

	public static String toString(byte[] bytes, Charset charset) throws IOException {
		InputStreamReader isr = new InputStreamReader(new ByteArrayInputStream(notNull(bytes, "bytes")),
				charset == null ? StandardCharsets.UTF_8 : charset);
		StringWriter sw = new StringWriter();
		IOUtils.copy(isr, sw);
		return sw.toString();
	}

	public static String toString(InputStream in, Charset charset) throws IOException {
		return IOUtils.toString(IOUtils.toByteArray(in), charset);
	}

	public static String toString(byte[] bytes, String charset) throws IOException {
		InputStreamReader isr = new InputStreamReader(new ByteArrayInputStream(notNull(bytes, "bytes")),
				charset == null ? "UTF-8" : charset);
		StringWriter sw = new StringWriter();
		IOUtils.copy(isr, sw);
		return sw.toString();
	}

	public static String toString(InputStream in, String charset) throws IOException {
		return IOUtils.toString(IOUtils.toByteArray(in), charset);
	}

	public static String defaultCharset(String charset) {
		return charset == null ? "UTF-8" : charset;
	}

	public static Charset defaultCharset(Charset charset) {
		return charset == null ? StandardCharsets.UTF_8 : charset;
	}

	public static String safeCharset(String charset) {
		return charset == null ? "ISO-8859-1" : charset;
	}

	public static Charset safeCharset(Charset charset) {
		return charset == null ? StandardCharsets.ISO_8859_1 : charset;
	}

	public static InputStream getResourceAsStream(Class<?> clazz, String path) {
		InputStream is = notNull(clazz, "clazz").getResourceAsStream(notNull(path, "path"));
		if(is == null)
			throw new IllegalStateException("Resource is missing: " + path);
		return is;
	}

	public static String getResourceAsString(Class<?> clazz, String path, String charset) throws IOException {
		return IOUtils.toString(IOUtils.getResourceAsStream(clazz, path), charset);
	}

	public static String getResourceAsString(Class<?> clazz, String path, Charset charset) throws IOException {
		return IOUtils.toString(IOUtils.getResourceAsStream(clazz, path), charset);
	}

	public static void indent(Writer out, String indentString, int level) throws IOException {
		notNull(out, "out");
		notNegative(level, "level");
		if(indentString == null)
			indentString = IOUtils.DEFAULT_INDENT;
		for(int i = 0; i < level; ++i)
			out.write(indentString);
	}

	public static void indent(Writer out, int level) throws IOException {
		IOUtils.indent(out, null, level);
	}

	public static void eol(Writer out) throws IOException {
		notNull(out, "out").write(SystemProperties.LINE_SEPARATOR);
	}

	public static void eolIndent(Writer out, String indentString, int level) throws IOException {
		notNull(out, "out");
		notNegative(level, "level");
		if(indentString == null)
			indentString = IOUtils.DEFAULT_INDENT;
		for(int i = 0; i < level; ++i)
			out.write(indentString);
		out.write(SystemProperties.LINE_SEPARATOR);
	}

	public static void eolIndent(Writer out, int level) throws IOException {
		IOUtils.eolIndent(out, null, level);
	}

}
