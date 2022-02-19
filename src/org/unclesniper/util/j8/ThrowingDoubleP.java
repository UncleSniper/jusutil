package org.unclesniper.util.j8;

public interface ThrowingDoubleP<ExceptionT extends Throwable> {

	boolean testDouble(double value) throws ExceptionT;

}
