package org.unclesniper.util.parseopt;

import java.util.Map;
import java.util.HashMap;

import static org.unclesniper.util.ArgUtils.notNull;

public class SimpleOptionSpec<ConfigT> implements OptionSpec<ConfigT> {

	private final Map<Character, OptionInfo<? super ConfigT>> shortOptions
			= new HashMap<Character, OptionInfo<? super ConfigT>>();

	private final Map<String, OptionInfo<? super ConfigT>> longOptions
			= new HashMap<String, OptionInfo<? super ConfigT>>();

	public SimpleOptionSpec() {}

	public void addShortOption(char name, OptionInfo<? super ConfigT> info) {
		shortOptions.put(name, notNull(info, "info"));
	}

	public void addLongOption(String name, OptionInfo<? super ConfigT> info) {
		longOptions.put(notNull(name, "name"), notNull(info, "info"));
	}

	@Override
	public OptionInfo<? super ConfigT> getShortOption(char name) {
		return shortOptions.get(name);
	}

	@Override
	public OptionInfo<? super ConfigT> getLongOption(String name) {
		return longOptions.get(notNull(name, "name"));
	}

}
