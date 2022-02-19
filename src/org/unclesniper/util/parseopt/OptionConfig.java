package org.unclesniper.util.parseopt;

import org.unclesniper.util.Optionality;

public interface OptionConfig {

	char getShortInitiator();

	char getLongInitiator();

	boolean isAllowShort();

	boolean isAllowLong();

	boolean isTryShortAsLong();

	String getEndMarker();

	boolean isAllowEndMarker();

	char getShortOptionArgumentSeparator();

	char getLongOptionArgumentSeparator();

	Optionality getShortOptionArgumentSeparatorOptionality();

	Optionality getLongOptionArgumentSeparatorOptionality();

	OptionPrecedence getOptionPrecedence();

	boolean isAllowShortArgumentQueue();

}
