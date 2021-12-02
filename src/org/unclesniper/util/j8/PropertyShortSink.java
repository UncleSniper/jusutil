package org.unclesniper.util.j8;

public class PropertyShortSink<BaseT> implements ShortSink {

	private BaseT base;

	private ShortSetter<? super BaseT> setter;

	public PropertyShortSink(BaseT base, ShortSetter<? super BaseT> setter) {
		this.base = base;
		this.setter = setter;
	}

	public BaseT getBase() {
		return base;
	}

	public void setBase(BaseT base) {
		this.base = base;
	}

	public ShortSetter<? super BaseT> getSetter() {
		return setter;
	}

	public void setSetter(ShortSetter<? super BaseT> setter) {
		this.setter = setter;
	}

	@Override
	public void putShort(short value) {
		setter.setShort(base, value);
	}

}
