package org.unclesniper.util.j8;

public interface ShortGetter<BaseT> extends IOShortGetter<BaseT> {

	@Override
	short getShort(BaseT base);

}
