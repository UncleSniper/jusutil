package org.unclesniper.util;

import java.util.Map;
import java.util.HashMap;

import static org.unclesniper.util.ArgUtils.notNull;

public final class BooleanUtils {

	private static final Map<String, Boolean> BOOLEAN_NAMES;

	static {
		BOOLEAN_NAMES = new HashMap<String, Boolean>();
		BOOLEAN_NAMES.put("true", Boolean.TRUE);
		BOOLEAN_NAMES.put("yes", Boolean.TRUE);
		BOOLEAN_NAMES.put("on", Boolean.TRUE);
		BOOLEAN_NAMES.put("1", Boolean.TRUE);
		BOOLEAN_NAMES.put("false", Boolean.FALSE);
		BOOLEAN_NAMES.put("no", Boolean.FALSE);
		BOOLEAN_NAMES.put("off", Boolean.FALSE);
		BOOLEAN_NAMES.put("0", Boolean.FALSE);
	}

	private BooleanUtils() {}

	public static boolean parseBoolean(String value) {
		value = notNull(value, "value").trim().toLowerCase();
		Boolean fromMap = BooleanUtils.BOOLEAN_NAMES.get(value);
		if(fromMap == null)
			throw new IllegalArgumentException("Unrecognized name for boolean value: " + value);
		return fromMap;
	}

}
