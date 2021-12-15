package org.unclesniper.util;

public interface Executable<ExceptionT extends Throwable> {

	void execute() throws ExceptionT;

}
