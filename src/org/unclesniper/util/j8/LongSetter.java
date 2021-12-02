package org.unclesniper.util.j8;

public interface LongSetter<BaseT> extends IOLongSetter<BaseT> {

	@Override
	void setLong(BaseT base, long value);

}
