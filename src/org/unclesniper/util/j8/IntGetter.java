package org.unclesniper.util.j8;

public interface IntGetter<BaseT> extends IOIntGetter<BaseT> {

	@Override
	int getInt(BaseT base);

}
