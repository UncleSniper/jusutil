package org.unclesniper.util.j8;

public interface ThrowingBooleanToByte<ExceptionT extends Throwable> {

	byte apply(boolean arg) throws ExceptionT;

}
