package org.unclesniper.util.parseopt;

import java.util.List;

import static org.unclesniper.util.PropertyUtils.requireSet;

public class NoArgumentOptionInfo<ConfigT> extends AbstractOptionInfo<ConfigT> {

	private NoArgumentOptionAction<? super ConfigT> action;

	public NoArgumentOptionInfo(String description, NoArgumentOptionAction<? super ConfigT> action) {
		super(description);
		this.action = action;
	}

	public NoArgumentOptionAction<? super ConfigT> getAction() {
		return action;
	}

	public void setAction(NoArgumentOptionAction<? super ConfigT> action) {
		this.action = action;
	}

	@Override
	public int getMinArity() {
		return 0;
	}

	@Override
	public int getMaxArity() {
		return 0;
	}

	@Override
	public void encountered(ConfigT config, OptionName option, List<String> arguments) throws CommandLineException {
		if(arguments != null && !arguments.isEmpty())
			throw new ExtraneousOptionArgumentException(option);
		requireSet(action, "action", this).perform(config, option);
	}

}
