package org.unclesniper.util.j8;

public interface ByteSetter<BaseT> extends IOByteSetter<BaseT>, ThrowingByteSetter<BaseT, RuntimeException> {

	@Override
	void setByte(BaseT base, byte value);

}
