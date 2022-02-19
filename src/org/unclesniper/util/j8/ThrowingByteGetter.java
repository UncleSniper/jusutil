package org.unclesniper.util.j8;

public interface ThrowingByteGetter<BaseT, ExceptionT extends Throwable> {

	byte getByte(BaseT base) throws ExceptionT;

}
