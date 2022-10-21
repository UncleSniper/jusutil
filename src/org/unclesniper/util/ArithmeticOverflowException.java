package org.unclesniper.util;

public class ArithmeticOverflowException extends ArithmeticPrecisionExceededException {

	public ArithmeticOverflowException(String message) {
		super(message);
	}

	public ArithmeticOverflowException() {
		this("Arithmetic overflow");
	}

}
