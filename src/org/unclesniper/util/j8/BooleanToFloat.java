package org.unclesniper.util.j8;

public interface BooleanToFloat extends IOBooleanToFloat, ThrowingBooleanToFloat<RuntimeException> {

	@Override
	float apply(boolean arg);

}
