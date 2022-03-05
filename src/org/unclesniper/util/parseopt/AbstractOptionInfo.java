package org.unclesniper.util.parseopt;

public abstract class AbstractOptionInfo<ConfigT> implements OptionInfo<ConfigT> {

	private String description;

	public AbstractOptionInfo() {}

	public AbstractOptionInfo(String description) {
		this.description = description;
	}

	@Override
	public String getDescription() {
		return description;
	}

	public void setDesciption(String description) {
		this.description = description;
	}

}
