package org.unclesniper.util.j8;

public interface DoubleSetter<BaseT>
		extends IODoubleSetter<BaseT>, ThrowingDoubleSetter<BaseT, RuntimeException> {

	@Override
	void setDouble(BaseT base, double value);

}
