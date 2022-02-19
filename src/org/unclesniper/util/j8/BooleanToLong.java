package org.unclesniper.util.j8;

public interface BooleanToLong extends IOBooleanToLong, ThrowingBooleanToLong<RuntimeException> {

	@Override
	long apply(boolean arg);

}
