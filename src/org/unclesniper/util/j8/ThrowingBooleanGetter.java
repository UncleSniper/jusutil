package org.unclesniper.util.j8;

public interface ThrowingBooleanGetter<BaseT, ExceptionT extends Throwable> {

	boolean getBoolean(BaseT base) throws ExceptionT;

}
