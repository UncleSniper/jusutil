package org.unclesniper.util.parseopt;

public class UnrecognizedOptionException extends OptionException {

	public UnrecognizedOptionException(boolean longOption, String optionInitiator, String optionName) {
		super("Unrecognized command line option", longOption, optionInitiator, optionName);
	}

	public UnrecognizedOptionException(OptionName option) {
		super("Unrecognized command line option", option);
	}

}
