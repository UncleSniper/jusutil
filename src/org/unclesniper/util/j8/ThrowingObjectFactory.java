package org.unclesniper.util.j8;

import java.io.IOException;

import static org.unclesniper.util.ArgUtils.notNull;

public interface ThrowingObjectFactory<ValueT, InstantiationExceptionT extends Throwable> {

	ValueT newObject() throws InstantiationExceptionT;

	public static <ValueT, InstantiationExceptionT extends Throwable>
	ThrowingObjectFactory<ValueT, InstantiationExceptionT> fromPure(ObjectFactory<? extends ValueT> factory) {
		notNull(factory, "factory");
		return factory::newObject;
	}

	public static <ValueT> ThrowingObjectFactory<ValueT, IOException> fromIO(
		IOObjectFactory<? extends ValueT> factory
	) {
		notNull(factory, "factory");
		return factory::newObject;
	}

	public static <ValueT, InstantiationExceptionT extends Throwable>
	ThrowingObjectFactory<ValueT, InstantiationExceptionT> widenException(
		ThrowingObjectFactory<? extends ValueT, ? extends InstantiationExceptionT> factory
	) {
		notNull(factory, "factory");
		return factory::newObject;
	}

}
