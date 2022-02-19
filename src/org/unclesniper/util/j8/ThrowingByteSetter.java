package org.unclesniper.util.j8;

public interface ThrowingByteSetter<BaseT, ExceptionT extends Throwable> {

	void setByte(BaseT base, byte value) throws ExceptionT;

}
