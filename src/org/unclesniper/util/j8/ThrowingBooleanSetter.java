package org.unclesniper.util.j8;

public interface ThrowingBooleanSetter<BaseT, ExceptionT extends Throwable> {

	void setBoolean(BaseT base, boolean value) throws ExceptionT;

}
