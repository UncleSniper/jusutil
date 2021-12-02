package org.unclesniper.util.j8;

public interface ObjectGetter<BaseT, PropertyT> extends IOObjectGetter<BaseT, PropertyT> {

	@Override
	PropertyT getProperty(BaseT base);

}
