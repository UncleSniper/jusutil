package org.unclesniper.util.parseopt;

public class ExtraneousOptionArgumentException extends OptionException {

	public ExtraneousOptionArgumentException(boolean longOption, String optionInitiator, String optionName) {
		super("Extraneous argument to command line option", longOption, optionInitiator, optionName);
	}

	public ExtraneousOptionArgumentException(OptionName option) {
		super("Extraneous argument to command line option", option);
	}

}
