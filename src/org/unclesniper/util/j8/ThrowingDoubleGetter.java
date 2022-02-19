package org.unclesniper.util.j8;

public interface ThrowingDoubleGetter<BaseT, ExceptionT extends Throwable> {

	double getDouble(BaseT base) throws ExceptionT;

}
