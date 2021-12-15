package org.unclesniper.util;

@FunctionalInterface
public interface Executable<ExceptionT extends Throwable> {

	void execute() throws ExceptionT;

}
