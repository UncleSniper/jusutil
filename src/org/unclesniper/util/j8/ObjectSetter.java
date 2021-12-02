package org.unclesniper.util.j8;

public interface ObjectSetter<BaseT, PropertyT> extends IOObjectSetter<BaseT, PropertyT> {

	@Override
	void setProperty(BaseT base, PropertyT value);

}
