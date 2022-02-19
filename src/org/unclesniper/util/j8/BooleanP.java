package org.unclesniper.util.j8;

public interface BooleanP extends IOBooleanP, ThrowingBooleanP<RuntimeException> {

	@Override
	boolean testBoolean(boolean value);

}
