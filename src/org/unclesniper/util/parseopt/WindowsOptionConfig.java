package org.unclesniper.util.parseopt;

import org.unclesniper.util.Optionality;

public class WindowsOptionConfig implements OptionConfig {

	public static final OptionConfig instance = new WindowsOptionConfig();

	public WindowsOptionConfig() {}

	@Override
	public char getShortInitiator() {
		return '/';
	}

	@Override
	public String getLongInitiator() {
		return "/";
	}

	@Override
	public boolean isAllowShort() {
		return true;
	}

	@Override
	public boolean isAllowLong() {
		return true;
	}

	@Override
	public boolean isTryShortAsLong() {
		return false;
	}

	@Override
	public String getEndMarker() {
		return null;
	}

	@Override
	public boolean isAllowEndMarker() {
		return false;
	}

	@Override
	public char getShortOptionArgumentSeparator() {
		return ':';
	}

	@Override
	public char getLongOptionArgumentSeparator() {
		return ':';
	}

	@Override
	public Optionality getShortOptionArgumentSeparatorOptionality() {
		return Optionality.REQUIRE;
	}

	@Override
	public Optionality getLongOptionArgumentSeparatorOptionality() {
		return Optionality.REQUIRE;
	}

	@Override
	public OptionPrecedence getOptionPrecedence() {
		return OptionPrecedence.AMBIGUITY_IS_ERROR;
	}

	@Override
	public boolean isAllowShortArgumentQueue() {
		return false;
	}

	@Override
	public boolean isNonOptionTerminates() {
		return false;
	}

	@Override
	public boolean isAllowInlineShortArgument() {
		return true;
	}

	@Override
	public boolean isAllowSeparateShortArgument() {
		return false;
	}

	@Override
	public boolean isAllowInlineLongArgument() {
		return true;
	}

	@Override
	public boolean isAllowSeparateLongArgument() {
		return false;
	}

	@Override
	public OptionArgumentPrecedence getOptionArgumentPrecedence() {
		return OptionArgumentPrecedence.AMBIGUITY_IS_ERROR;
	}

}
