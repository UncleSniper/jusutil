package org.unclesniper.util.j8;

public interface ObjectFactory<ValueT> extends IOObjectFactory<ValueT> {

	@Override
	ValueT newObject();

}
