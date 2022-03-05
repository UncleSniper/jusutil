package org.unclesniper.util.parseopt;

public interface SingleArgumentOptionAction<ConfigT> {

	void perform(ConfigT config, OptionName option, String argument) throws CommandLineException;

}
