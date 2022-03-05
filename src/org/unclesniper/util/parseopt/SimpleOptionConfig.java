package org.unclesniper.util.parseopt;

import org.unclesniper.util.Optionality;

public final class SimpleOptionConfig implements OptionConfig {

	private char shortInitiator = '-';

	private String longInitiator = "--";

	private boolean allowShort = true;

	private boolean allowLong = true;

	private boolean tryShortAsLong;

	private String endMarker;

	private boolean allowEndMarker = true;

	private char shortOptionArgumentSeparator = '\u0000';

	private char longOptionArgumentSeparator = '=';

	private Optionality shortOptionArgumentSeparatorOptionality = Optionality.REJECT;

	private Optionality longOptionArgumentSeparatorOptionality = Optionality.ALLOW;

	private OptionPrecedence optionPrecedence;

	private boolean allowShortArgumentQueue;

	private boolean nonOptionTerminates;

	private boolean allowInlineShortArgument;

	private boolean allowSeparateShortArgument;

	private boolean allowInlineLongArgument;

	private boolean allowSeparateLongArgument;

	private OptionArgumentPrecedence optionArgumentPrecedence = OptionArgumentPrecedence.AMBIGUITY_IS_ERROR;

	public SimpleOptionConfig() {}

	@Override
	public char getShortInitiator() {
		return shortInitiator;
	}

	public void setShortInitiator(char shortInitiator) {
		this.shortInitiator = shortInitiator;
	}

	@Override
	public String getLongInitiator() {
		return longInitiator;
	}

	public void setLongInitiator(String longInitiator) {
		this.longInitiator = longInitiator;
	}

	@Override
	public boolean isAllowShort() {
		return allowShort;
	}

	public void setAllowShort(boolean allowShort) {
		this.allowShort = allowShort;
	}

	@Override
	public boolean isAllowLong() {
		return allowLong;
	}

	public void setAllowLong(boolean allowLong) {
		this.allowLong = allowLong;
	}

	@Override
	public boolean isTryShortAsLong() {
		return tryShortAsLong;
	}

	public void setTryShortAsLong(boolean tryShortAsLong) {
		this.tryShortAsLong = tryShortAsLong;
	}

	@Override
	public String getEndMarker() {
		return endMarker;
	}

	public void setEndMarker(String endMarker) {
		this.endMarker = endMarker;
	}

	@Override
	public boolean isAllowEndMarker() {
		return allowEndMarker;
	}

	public void setAllowEndMarker(boolean allowEndMarker) {
		this.allowEndMarker = allowEndMarker;
	}

	@Override
	public char getShortOptionArgumentSeparator() {
		return shortOptionArgumentSeparator;
	}

	public void setShortOptionArgumentSeparator(char shortOptionArgumentSeparator) {
		this.shortOptionArgumentSeparator = shortOptionArgumentSeparator;
	}

	@Override
	public char getLongOptionArgumentSeparator() {
		return longOptionArgumentSeparator;
	}

	public void setLongOptionArgumentSeparator(char longOptionArgumentSeparator) {
		this.longOptionArgumentSeparator = longOptionArgumentSeparator;
	}

	@Override
	public Optionality getShortOptionArgumentSeparatorOptionality() {
		return shortOptionArgumentSeparatorOptionality;
	}

	public void setShortOptionArgumentSeparatorOptionality(Optionality shortOptionArgumentSeparatorOptionality) {
		this.shortOptionArgumentSeparatorOptionality = shortOptionArgumentSeparatorOptionality;
	}

	@Override
	public Optionality getLongOptionArgumentSeparatorOptionality() {
		return longOptionArgumentSeparatorOptionality;
	}

	public void setLongOptionArgumentSeparatorOptionality(Optionality longOptionArgumentSeparatorOptionality) {
		this.longOptionArgumentSeparatorOptionality = longOptionArgumentSeparatorOptionality;
	}

	@Override
	public OptionPrecedence getOptionPrecedence() {
		return optionPrecedence;
	}

	public void setOptionPrecedence(OptionPrecedence optionPrecedence) {
		this.optionPrecedence = optionPrecedence;
	}

	@Override
	public boolean isAllowShortArgumentQueue() {
		return allowShortArgumentQueue;
	}

	public void setAllowShortArgumentQueue(boolean allowShortArgumentQueue) {
		this.allowShortArgumentQueue = allowShortArgumentQueue;
	}

	@Override
	public boolean isNonOptionTerminates() {
		return nonOptionTerminates;
	}

	public void setNonOptionTerminates(boolean nonOptionTerminates) {
		this.nonOptionTerminates = nonOptionTerminates;
	}

	@Override
	public boolean isAllowInlineShortArgument() {
		return allowInlineShortArgument;
	}

	public void setAllowInlineShortArgument(boolean allowInlineShortArgument) {
		this.allowInlineShortArgument = allowInlineShortArgument;
	}

	@Override
	public boolean isAllowSeparateShortArgument() {
		return allowSeparateShortArgument;
	}

	public void setAllowSeparateShortArgument(boolean allowSeparateShortArgument) {
		this.allowSeparateShortArgument = allowSeparateShortArgument;
	}

	@Override
	public boolean isAllowInlineLongArgument() {
		return allowInlineLongArgument;
	}

	public void setAllowInlineLongArgument(boolean allowInlineLongArgument) {
		this.allowInlineLongArgument = allowInlineLongArgument;
	}

	@Override
	public boolean isAllowSeparateLongArgument() {
		return allowSeparateLongArgument;
	}

	public void setAllowSeparateLongArgument(boolean allowSeparateLongArgument) {
		this.allowSeparateLongArgument = allowSeparateLongArgument;
	}

	@Override
	public OptionArgumentPrecedence getOptionArgumentPrecedence() {
		return optionArgumentPrecedence;
	}

	public void setOptionArgumentPrecedence(OptionArgumentPrecedence optionArgumentPrecedence) {
		this.optionArgumentPrecedence = optionArgumentPrecedence;
	}

}
