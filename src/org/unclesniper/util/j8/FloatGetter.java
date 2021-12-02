package org.unclesniper.util.j8;

public interface FloatGetter<BaseT> extends IOFloatGetter<BaseT> {

	@Override
	float getFloat(BaseT base);

}
