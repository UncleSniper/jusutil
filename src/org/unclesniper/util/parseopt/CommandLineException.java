package org.unclesniper.util.parseopt;

public class CommandLineException extends Exception {

	public CommandLineException(String message) {
		super(message);
	}

	public CommandLineException(Throwable cause) {
		super(cause);
	}

	public CommandLineException(String message, Throwable cause) {
		super(message, cause);
	}

}
