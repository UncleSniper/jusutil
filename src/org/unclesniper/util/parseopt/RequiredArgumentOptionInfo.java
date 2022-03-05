package org.unclesniper.util.parseopt;

import java.util.List;
import org.unclesniper.util.j8.ThrowingObjectSink;

import static org.unclesniper.util.PropertyUtils.requireSet;

public class RequiredArgumentOptionInfo<ConfigT> extends AbstractOptionInfo<ConfigT> {

	private SingleArgumentOptionAction<? super ConfigT> action;

	public RequiredArgumentOptionInfo(String description, SingleArgumentOptionAction<? super ConfigT> action) {
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
		return 1;
	}

	@Override
	public int getMaxArity() {
		return 1;
	}

	@Override
	public void encountered(ConfigT config, OptionName option, List<String> arguments) throws CommandLineException {
		if(arguments == null || arguments.isEmpty())
			throw new MissingOptionArgumentException(option);
		requireSet(action, "action", this).perform(config, option, arguments.get(0));
	}

}
