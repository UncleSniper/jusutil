package org.unclesniper.util.j8;

public interface DoubleGetter<BaseT> extends IODoubleGetter<BaseT>, ThrowingDoubleGetter<BaseT, RuntimeException> {

	@Override
	double getDouble(BaseT base);

}
