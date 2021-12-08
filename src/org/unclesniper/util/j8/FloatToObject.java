package org.unclesniper.util.j8;

public interface FloatToObject<ReturnT> extends IOFloatToObject<ReturnT> {

	@Override
	ReturnT apply(float arg);

}
