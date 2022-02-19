package org.unclesniper.util.parseopt;

public interface OptionSpec<ConfigT> {

	OptionInfo<? super ConfigT> getShortOption(char name);

	OptionInfo<? super ConfigT> getLongOption(String name);

}
