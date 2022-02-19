package org.unclesniper.util.parseopt;

public abstract class AbstractOptionInfo<ConfigT> implements OptionInfo<ConfigT> {

	private boolean longOption;

	private String optionInitiator;

	private String optionName;

	private String description;

	public AbstractOptionInfo() {}

	public AbstractOptionInfo(boolean longOption, String optionInitiator, String optionName, String description) {
		this.longOption = longOption;
		this.optionInitiator = optionInitiator;
		this.optionName = optionName;
		this.description = description;
	}

	public boolean isLongOption() {
		return longOption;
	}

	public void setLongOption(boolean longOption) {
		this.longOption = longOption;
	}

	public String getOptionInitiator() {
		return optionInitiator;
	}

	public void setOptionInitiator(String optionInitiator) {
		this.optionInitiator = optionInitiator;
	}

	public String getOptionName() {
		return optionName;
	}

	public void setOptionName(String optionName) {
		this.optionName = optionName;
	}

	@Override
	public String getDescription() {
		return description;
	}

	public void setDesciption(String description) {
		this.description = description;
	}

}
