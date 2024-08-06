package org.unclesniper.util;

import java.io.PrintStream;
import java.io.PrintWriter;

public interface Tossable {

	String getMessage();

	String getLocalizedMessage();

	Throwable getCause();

	void printStackTrace();

	void printStackTrace(PrintStream s);

	void printStackTrace(PrintWriter s);

	StackTraceElement[] getStackTrace();

	void addSuppressed(Throwable exception);

	Throwable[] getSuppressed();

}
