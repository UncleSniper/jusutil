package org.unclesniper.util.j8;

public class ConstantStringFactory implements StringFactory {

	private String value;

	public ConstantStringFactory() {}

	public ConstantStringFactory(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String newObject() {
		return value;
	}

}
