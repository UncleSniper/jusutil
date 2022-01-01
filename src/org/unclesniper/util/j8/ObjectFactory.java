package org.unclesniper.util.j8;

import static org.unclesniper.util.ArgUtils.notNull;

public interface ObjectFactory<ValueT> extends IOObjectFactory<ValueT> {

	@Override
	ValueT newObject();

	public static <ValueT> ObjectFactory<ValueT> fromThrowing(
		ThrowingObjectFactory<? extends ValueT, ? extends RuntimeException> factory
	) {
		notNull(factory, "factory");
		return factory::newObject;
	}

}
