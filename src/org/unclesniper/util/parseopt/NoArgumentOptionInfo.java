package org.unclesniper.util.parseopt;

import org.unclesniper.util.Executable;
import org.unclesniper.util.Optionality;

import static org.unclesniper.util.PropertyUtils.requireSet;

public class NoArgumentOptionInfo<ConfigT> extends AbstractOptionInfo<ConfigT> {

	private Executable<? extends CommandLineException> action;

	public NoArgumentOptionInfo(boolean longOption, String optionInitiator, String optionName, String description,
			Executable<? extends CommandLineException> action) {
		super(longOption, optionInitiator, optionName, description);
		this.action = action;
	}

	public Executable<? extends CommandLineException> getAction() {
		return action;
	}

	@Override
	public Optionality takesArgument() {
		return Optionality.REJECT;
	}

	@Override
	public void encountered(ConfigT config, boolean longOption, String optionInitiator, String optionName)
			throws CommandLineException {
		requireSet(action, "action", this).execute();
	}

	@Override
	public void encountered(ConfigT config, boolean longOption, String optionInitiator, String optionName,
			String argument) throws CommandLineException {
		throw new ExtraneousOptionArgumentException(longOption, optionInitiator, optionName);
	}

}
