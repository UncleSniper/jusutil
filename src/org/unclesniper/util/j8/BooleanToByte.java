package org.unclesniper.util.j8;

public interface BooleanToByte extends IOBooleanToByte, ThrowingBooleanToByte<RuntimeException> {

	@Override
	byte apply(boolean arg);

}
