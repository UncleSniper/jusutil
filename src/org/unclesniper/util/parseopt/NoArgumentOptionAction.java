package org.unclesniper.util.parseopt;

public interface NoArgumentOptionAction<ConfigT> {

	void perform(ConfigT config, OptionName option) throws CommandLineException;

}
