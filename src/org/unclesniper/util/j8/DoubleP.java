package org.unclesniper.util.j8;

public interface DoubleP extends IODoubleP, ThrowingDoubleP<RuntimeException> {

	@Override
	boolean testDouble(double value);

}
