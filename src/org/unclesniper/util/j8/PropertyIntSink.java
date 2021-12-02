package org.unclesniper.util.j8;

public class PropertyIntSink<BaseT> implements IntSink {

	private BaseT base;

	private IntSetter<? super BaseT> setter;

	public PropertyIntSink(BaseT base, IntSetter<? super BaseT> setter) {
		this.base = base;
		this.setter = setter;
	}

	public BaseT getBase() {
		return base;
	}

	public void setBase(BaseT base) {
		this.base = base;
	}

	public IntSetter<? super BaseT> getSetter() {
		return setter;
	}

	public void setSetter(IntSetter<? super BaseT> setter) {
		this.setter = setter;
	}

	@Override
	public void putInt(int value) {
		setter.setInt(base, value);
	}

}
