package org.unclesniper.util;

import static org.unclesniper.util.ArgUtils.notNull;

public interface PartialStringable {

	void toString(StringBuilder sink);

	public static String toString(PartialStringable object) {
		StringBuilder builder = new StringBuilder();
		notNull(object, "object").toString(builder);
		return builder.toString();
	}

}
