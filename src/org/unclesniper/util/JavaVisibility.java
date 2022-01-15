package org.unclesniper.util;

import java.util.Map;
import java.util.HashMap;

import static org.unclesniper.util.ArgUtils.notNull;

public enum JavaVisibility {

	PRIVATE,
	PROTECTED,
	PACKAGE,
	PUBLIC;

	private static final Map<String, JavaVisibility> BY_NAME;

	static {
		BY_NAME = new HashMap<String, JavaVisibility>();
		for(JavaVisibility visibility : JavaVisibility.values())
			BY_NAME.put(visibility.name(), visibility);
		BY_NAME.put("DEFAULT", JavaVisibility.PACKAGE);
	}

	public static JavaVisibility byName(String name) {
		name = notNull(name, "name").toUpperCase();
		JavaVisibility visibility = JavaVisibility.BY_NAME.get(name);
		if(visibility == null)
			throw new IllegalArgumentException("Unrecognized Java visibility: " + name);
		return visibility;
	}

}
