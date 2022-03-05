package org.unclesniper.util.parseopt;

import static org.unclesniper.util.ArgUtils.notNull;
import static org.unclesniper.util.PropertyUtils.returnNotNull;

public class OptionException extends CommandLineException implements OptionName {

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

	public OptionException(String message, OptionName option) {
		this(message, option, null);
	}

	public OptionException(String message, OptionName option, Throwable cause) {
		super(OptionException.makeMessage(message, option), cause);
		longOption = option.isLongOption();
		optionInitiator = option.getOptionInitiator();
		optionName = option.getOptionName();
	}

	@Override
	public boolean isLongOption() {
		return longOption;
	}

	@Override
	public String getOptionInitiator() {
		return optionInitiator;
	}

	@Override
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

	private static String makeMessage(String message, OptionName option) {
		StringBuilder builder = new StringBuilder();
		if(message != null && !message.isEmpty()) {
			builder.append(message);
			builder.append(": ");
		}
		builder.append(returnNotNull(notNull(option, "option").getOptionInitiator(), option, "getOptionInitiator"));
		builder.append(returnNotNull(option.getOptionName(), option, "getOptionName"));
		return builder.toString();
	}

}
