package org.unclesniper.util.parseopt;

import static org.unclesniper.util.ArgUtils.notNull;

public class OptionException extends CommandLineException {

	private final boolean longOption;

	private final String optionInitiator;

	private final String optionName;

	public OptionException(String message, boolean longOption, String optionInitiator, String optionName) {
		this(message, longOption, optionInitiator, optionName, null);
	}

	public OptionException(String message, boolean longOption, String optionInitiator,
			String optionName, Throwable cause) {
		super(OptionException.makeMessage(message, optionInitiator, optionName), cause);
		this.longOption = longOption;
		this.optionInitiator = optionInitiator;
		this.optionName = optionName;
	}

	public boolean isLongOption() {
		return longOption;
	}

	public String getOptionInitiator() {
		return optionInitiator;
	}

	public String getOptionName() {
		return optionName;
	}

	private static String makeMessage(String message, String optionInitiator, String optionName) {
		StringBuilder builder = new StringBuilder();
		if(message != null && !message.isEmpty()) {
			builder.append(message);
			builder.append(": ");
		}
		builder.append(notNull(optionInitiator, "optionInitiator"));
		builder.append(notNull(optionName, "optionName"));
		return builder.toString();
	}

}
