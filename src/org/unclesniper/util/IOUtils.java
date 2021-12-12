package org.unclesniper.util;

import java.io.InputStream;
import java.io.IOException;
import java.io.OutputStream;

import static org.unclesniper.util.ArgUtils.notNull;

public final class IOUtils {

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

}
