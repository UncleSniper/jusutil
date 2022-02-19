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
	public char getLongInitiator() {
		return '/';
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

}
