package org.unclesniper.util.j8;

public interface ThrowingBooleanP<ExceptionT extends Throwable> {

	boolean testBoolean(boolean value) throws ExceptionT;

}
