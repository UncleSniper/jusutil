package org.unclesniper.util.j8;

public interface FloatSetter<BaseT> extends IOFloatSetter<BaseT> {

	@Override
	void setFloat(BaseT base, float value);

}
