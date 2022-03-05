package org.unclesniper.util.parseopt;

public class MissingOptionArgumentException extends OptionException {

	public MissingOptionArgumentException(boolean longOption, String optionInitiator, String optionName) {
		super("Missing argument to command line option", longOption, optionInitiator, optionName);
	}

	public MissingOptionArgumentException(OptionName option) {
		super("Missing argument to command line option", option);
	}

}
