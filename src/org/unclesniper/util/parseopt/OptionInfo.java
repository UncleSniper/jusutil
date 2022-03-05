package org.unclesniper.util.parseopt;

import java.util.List;

public interface OptionInfo<ConfigT> {

	int getMinArity();

	int getMaxArity();

	void encountered(ConfigT config, OptionName option, List<String> arguments) throws CommandLineException;

	String getDescription();

}
