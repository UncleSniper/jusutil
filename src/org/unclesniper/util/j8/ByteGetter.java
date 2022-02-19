package org.unclesniper.util.j8;

public interface ByteGetter<BaseT> extends IOByteGetter<BaseT>, ThrowingByteGetter<BaseT, RuntimeException> {

	@Override
	byte getByte(BaseT base);

}
