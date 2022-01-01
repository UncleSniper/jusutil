package org.unclesniper.util.j8;

import java.io.IOException;

import static org.unclesniper.util.ArgUtils.notNull;

public interface IOObjectFactory<ValueT> {

	ValueT newObject() throws IOException;

	public static <ValueT> IOObjectFactory<ValueT> fromThrowing(
		ThrowingObjectFactory<? extends ValueT, ? extends IOException> factory
	) {
		notNull(factory, "factory");
		return factory::newObject;
	}

}
