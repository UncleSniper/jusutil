package org.unclesniper.util.j8;

public interface ThrowingDoubleSetter<BaseT, ExceptionT extends Throwable> {

	void setDouble(BaseT base, double value) throws ExceptionT;

}
