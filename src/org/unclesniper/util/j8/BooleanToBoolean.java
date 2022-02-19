package org.unclesniper.util.j8;

public interface BooleanToBoolean extends IOBooleanToBoolean, ThrowingBooleanToBoolean<RuntimeException> {

	@Override
	boolean apply(boolean arg);

}
