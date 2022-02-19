package org.unclesniper.util.j8;

public interface BooleanToInt extends IOBooleanToInt, ThrowingBooleanToInt<RuntimeException> {

	@Override
	int apply(boolean arg);

}
