package org.unclesniper.util.parseopt;

import org.unclesniper.util.Optionality;

public interface OptionInfo<ConfigT> {

	Optionality takesArgument();

	void encountered(ConfigT config, boolean longOption, String optionInitiator, String optionName)
	throws CommandLineException;

	void encountered(ConfigT config, boolean longOption, String optionInitiator, String optionName,
			String argument) throws CommandLineException;

	String getDescription();

}
