package org.unclesniper.util.j8;

public interface ByteGetter<BaseT> extends IOByteGetter<BaseT> {

	@Override
	byte getByte(BaseT base);

}
