package org.unclesniper.util.parseopt;

import org.unclesniper.util.Optionality;
import org.unclesniper.util.j8.ThrowingObjectSink;

import static org.unclesniper.util.PropertyUtils.requireSet;

public class RequiredArgumentOptionInfo<ConfigT> extends AbstractOptionInfo<ConfigT> {

	private ThrowingObjectSink<? super String, ? extends CommandLineException> action;

	public RequiredArgumentOptionInfo(boolean longOption, String optionInitiator, String optionName,
			String description, ThrowingObjectSink<? super String, ? extends CommandLineException> action) {
		super(longOption, optionInitiator, optionName, description);
		this.action = action;
	}

	public ThrowingObjectSink<? super String, ? extends CommandLineException> getAction() {
		return action;
	}

	@Override
	public Optionality takesArgument() {
		return Optionality.REQUIRE;
	}

	@Override
	public void encountered(ConfigT config, boolean longOption, String optionInitiator, String optionName)
			throws CommandLineException {
		throw new MissingOptionArgumentException(longOption, optionInitiator, optionName);
	}

	@Override
	public void encountered(ConfigT config, boolean longOption, String optionInitiator, String optionName,
			String argument) throws CommandLineException {
		requireSet(action, "action", this).putObject(argument);
	}

}
