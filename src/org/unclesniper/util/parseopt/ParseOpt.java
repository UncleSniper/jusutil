package org.unclesniper.util.parseopt;

import org.unclesniper.util.SystemProperties;

public class ParseOpt {

	public static final OptionConfig PLATFORM_OPTION_CONFIG = SystemProperties.IS_WINDOWS
			? WindowsOptionConfig.instance : UnixOptionConfig.instance;

	private ParseOpt() {}

}
