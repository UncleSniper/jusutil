package org.unclesniper.util.j8;

public interface BooleanToObject<ReturnT>
		extends IOBooleanToObject<ReturnT>, ThrowingBooleanToObject<ReturnT, RuntimeException> {

	@Override
	ReturnT apply(boolean arg);

}
