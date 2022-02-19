package org.unclesniper.util.j8;

public interface BooleanSetter<BaseT>
		extends IOBooleanSetter<BaseT>, ThrowingBooleanSetter<BaseT, RuntimeException> {

	@Override
	void setBoolean(BaseT base, boolean value);

}
