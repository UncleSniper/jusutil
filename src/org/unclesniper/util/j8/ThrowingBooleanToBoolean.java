package org.unclesniper.util.j8;

public interface ThrowingBooleanToBoolean<ExceptionT extends Throwable> {

	boolean apply(boolean arg) throws ExceptionT;

}
