package org.unclesniper.util.j8;

public interface ByteSetter<BaseT> extends IOByteSetter<BaseT> {

	@Override
	void setByte(BaseT base, byte value);

}
