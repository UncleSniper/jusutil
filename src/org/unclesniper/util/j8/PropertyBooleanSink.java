package org.unclesniper.util.j8;

public class PropertyBooleanSink<BaseT> implements BooleanSink {

	private BaseT base;

	private BooleanSetter<? super BaseT> setter;

	public PropertyBooleanSink(BaseT base, BooleanSetter<? super BaseT> setter) {
		this.base = base;
		this.setter = setter;
	}

	public BaseT getBase() {
		return base;
	}

	public void setBase(BaseT base) {
		this.base = base;
	}

	public BooleanSetter<? super BaseT> getSetter() {
		return setter;
	}

	public void setSetter(BooleanSetter<? super BaseT> setter) {
		this.setter = setter;
	}

	@Override
	public void putBoolean(boolean value) {
		setter.setBoolean(base, value);
	}

}
