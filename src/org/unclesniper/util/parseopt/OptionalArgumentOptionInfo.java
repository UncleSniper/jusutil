package org.unclesniper.util.parseopt;

import java.util.List;
import org.unclesniper.util.j8.ThrowingObjectSink;

import static org.unclesniper.util.PropertyUtils.requireSet;

public class OptionalArgumentOptionInfo<ConfigT> extends AbstractOptionInfo<ConfigT> {

	private SingleArgumentOptionAction<? super ConfigT> action;

	public OptionalArgumentOptionInfo(String description, SingleArgumentOptionAction<? super ConfigT> action) {
		super(description);
		this.action = action;
	}

	public SingleArgumentOptionAction<? super ConfigT> getAction() {
		return action;
	}

	public void setAction(SingleArgumentOptionAction<? super ConfigT> action) {
		this.action = action;
	}

	@Override
	public int getMinArity() {
		return 0;
	}

	@Override
	public int getMaxArity() {
		return 1;
	}

	@Override
	public void encountered(ConfigT config, OptionName option, List<String> arguments) throws CommandLineException {
		String argument = arguments == null || arguments.isEmpty() ? null : arguments.get(0);
		requireSet(action, "action", this).perform(config, option, argument);
	}

}
