package org.unclesniper.util.parseopt;

public class ExtraneousOptionArgumentException extends OptionException {

	public ExtraneousOptionArgumentException(boolean longOption, String optionInitiator, String optionName) {
		super("Extraneous option to command line option", longOption, optionInitiator, optionName);
	}

}
