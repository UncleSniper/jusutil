package org.unclesniper.util.j8;

public interface DoubleToObject<ReturnT> extends IODoubleToObject<ReturnT> {

	@Override
	ReturnT apply(double arg);

}
