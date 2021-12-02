package org.unclesniper.util.j8;

public class PropertyFloatSink<BaseT> implements FloatSink {

	private BaseT base;

	private FloatSetter<? super BaseT> setter;

	public PropertyFloatSink(BaseT base, FloatSetter<? super BaseT> setter) {
		this.base = base;
		this.setter = setter;
	}

	public BaseT getBase() {
		return base;
	}

	public void setBase(BaseT base) {
		this.base = base;
	}

	public FloatSetter<? super BaseT> getSetter() {
		return setter;
	}

	public void setSetter(FloatSetter<? super BaseT> setter) {
		this.setter = setter;
	}

	@Override
	public void putFloat(float value) {
		setter.setFloat(base, value);
	}

}
