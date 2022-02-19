package org.unclesniper.util.j8;

public interface BooleanGetter<BaseT>
		extends IOBooleanGetter<BaseT>, ThrowingBooleanGetter<BaseT, RuntimeException> {

	@Override
	boolean getBoolean(BaseT base);

}
