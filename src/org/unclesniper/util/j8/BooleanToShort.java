package org.unclesniper.util.j8;

public interface BooleanToShort extends IOBooleanToShort, ThrowingBooleanToShort<RuntimeException> {

	@Override
	short apply(boolean arg);

}
