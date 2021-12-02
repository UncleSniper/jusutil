package org.unclesniper.util.j8;

public interface LongGetter<BaseT> extends IOLongGetter<BaseT> {

	@Override
	long getLong(BaseT base);

}
