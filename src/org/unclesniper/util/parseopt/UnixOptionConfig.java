package org.unclesniper.util.parseopt;

import org.unclesniper.util.Optionality;

public class UnixOptionConfig implements OptionConfig {

	public static final OptionConfig instance = new UnixOptionConfig();

	public UnixOptionConfig() {}

	@Override
	public char getShortInitiator() {
		return '-';
	}

	@Override
	public String getLongInitiator() {
		return "--";
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
		return "--";
	}

	@Override
	public boolean isAllowEndMarker() {
		return true;
	}

	@Override
	public char getShortOptionArgumentSeparator() {
		return '\u0000';
	}

	@Override
	public char getLongOptionArgumentSeparator() {
		return '=';
	}

	@Override
	public Optionality getShortOptionArgumentSeparatorOptionality() {
		return Optionality.REJECT;
	}

	@Override
	public Optionality getLongOptionArgumentSeparatorOptionality() {
		return Optionality.ALLOW;
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
		return true;
	}

	@Override
	public boolean isAllowInlineLongArgument() {
		return true;
	}

	@Override
	public boolean isAllowSeparateLongArgument() {
		return true;
	}

	@Override
	public OptionArgumentPrecedence getOptionArgumentPrecedence() {
		return OptionArgumentPrecedence.AMBIGUITY_IS_ERROR;
	}

}
