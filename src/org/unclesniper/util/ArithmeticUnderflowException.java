package org.unclesniper.util;

public class ArithmeticUnderflowException extends ArithmeticPrecisionExceededException {

	public ArithmeticUnderflowException(String message) {
		super(message);
	}

	public ArithmeticUnderflowException() {
		this("Arithmetic underflow");
	}

}
