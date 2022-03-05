package org.unclesniper.util.parseopt;

import org.unclesniper.util.Optionality;

public interface OptionConfig {

	char getShortInitiator();

	String getLongInitiator();

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

	boolean isNonOptionTerminates();

	boolean isAllowInlineShortArgument();

	boolean isAllowSeparateShortArgument();

	boolean isAllowInlineLongArgument();

	boolean isAllowSeparateLongArgument();

	OptionArgumentPrecedence getOptionArgumentPrecedence();

}
