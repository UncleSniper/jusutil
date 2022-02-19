package org.unclesniper.util.parseopt;

import org.unclesniper.util.Optionality;
import org.unclesniper.util.j8.ThrowingObjectSink;

import static org.unclesniper.util.PropertyUtils.requireSet;

public class OptionalArgumentOptionInfo<ConfigT> extends AbstractOptionInfo<ConfigT> {

	private ThrowingObjectSink<? super String, ? extends CommandLineException> action;

	public OptionalArgumentOptionInfo(boolean longOption, String optionInitiator, String optionName,
			String description, ThrowingObjectSink<? super String, ? extends CommandLineException> action) {
		super(longOption, optionInitiator, optionName, description);
		this.action = action;
	}

	public ThrowingObjectSink<? super String, ? extends CommandLineException> getAction() {
		return action;
	}

	@Override
	public Optionality takesArgument() {
		return Optionality.ALLOW;
	}

	@Override
	public void encountered(ConfigT config, boolean longOption, String optionInitiator, String optionName)
			throws CommandLineException {
		requireSet(action, "action", this).putObject(null);
	}

	@Override
	public void encountered(ConfigT config, boolean longOption, String optionInitiator, String optionName,
			String argument) throws CommandLineException {
		requireSet(action, "action", this).putObject(argument);
	}

}
