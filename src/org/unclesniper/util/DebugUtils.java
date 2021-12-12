package org.unclesniper.util;

import static org.unclesniper.util.ArgUtils.notNull;

public class DebugUtils {

	private DebugUtils() {}

	public static boolean getDebugFlag(String property) {
		String value = System.getProperty(notNull(property, "property"));
		if(value == null)
			return false;
		try {
			return BooleanUtils.parseBoolean(value);
		}
		catch(IllegalArgumentException iae) {
			System.err.println("*** Tsk, tsk, tsk! Unrecognized boolean value in system property '" + property
					+ "': " + value);
			return false;
		}
	}

}
