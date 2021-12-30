package org.unclesniper.util.j8;

import java.util.Objects;
import org.unclesniper.util.HashUtils;

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
		if(!(other instanceof ConstantStringFactory))
			return false;
		return Objects.equals(value, ((ConstantStringFactory)other).value);
	}

}
