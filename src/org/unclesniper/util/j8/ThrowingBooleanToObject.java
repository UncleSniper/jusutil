package org.unclesniper.util.j8;

public interface ThrowingBooleanToObject<ReturnT, ExceptionT extends Throwable> {

	ReturnT apply(boolean arg) throws ExceptionT;

}
