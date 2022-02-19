package org.unclesniper.util.j8;

public interface BooleanToDouble extends IOBooleanToDouble, ThrowingBooleanToDouble<RuntimeException> {

	@Override
	double apply(boolean arg);

}
