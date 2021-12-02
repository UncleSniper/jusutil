package org.unclesniper.util.j8;

public class PropertyLongSink<BaseT> implements LongSink {

	private BaseT base;

	private LongSetter<? super BaseT> setter;

	public PropertyLongSink(BaseT base, LongSetter<? super BaseT> setter) {
		this.base = base;
		this.setter = setter;
	}

	public BaseT getBase() {
		return base;
	}

	public void setBase(BaseT base) {
		this.base = base;
	}

	public LongSetter<? super BaseT> getSetter() {
		return setter;
	}

	public void setSetter(LongSetter<? super BaseT> setter) {
		this.setter = setter;
	}

	@Override
	public void putLong(long value) {
		setter.setLong(base, value);
	}

}
