package org.unclesniper.util.j8;

public class PropertyDoubleSink<BaseT> implements DoubleSink {

	private BaseT base;

	private DoubleSetter<? super BaseT> setter;

	public PropertyDoubleSink(BaseT base, DoubleSetter<? super BaseT> setter) {
		this.base = base;
		this.setter = setter;
	}

	public BaseT getBase() {
		return base;
	}

	public void setBase(BaseT base) {
		this.base = base;
	}

	public DoubleSetter<? super BaseT> getSetter() {
		return setter;
	}

	public void setSetter(DoubleSetter<? super BaseT> setter) {
		this.setter = setter;
	}

	@Override
	public void putDouble(double value) {
		setter.setDouble(base, value);
	}

}
