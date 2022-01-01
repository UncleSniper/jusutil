package org.unclesniper.util.j8;

import java.util.Objects;
import org.unclesniper.util.HashUtils;
import org.unclesniper.util.EqualityUtils;

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

	@Override
	public int hashCode() {
		return HashUtils.hash(value);
	}

	@Override
	public boolean equals(Object other) {
		ConstantStringFactory factory = EqualityUtils.compareTo(other, ConstantStringFactory.class);
		return factory != null && Objects.equals(value, factory.value);
	}

}
