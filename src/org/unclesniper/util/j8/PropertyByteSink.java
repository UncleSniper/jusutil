package org.unclesniper.util.j8;

public class PropertyByteSink<BaseT> implements ByteSink {

	private BaseT base;

	private ByteSetter<? super BaseT> setter;

	public PropertyByteSink(BaseT base, ByteSetter<? super BaseT> setter) {
		this.base = base;
		this.setter = setter;
	}

	public BaseT getBase() {
		return base;
	}

	public void setBase(BaseT base) {
		this.base = base;
	}

	public ByteSetter<? super BaseT> getSetter() {
		return setter;
	}

	public void setSetter(ByteSetter<? super BaseT> setter) {
		this.setter = setter;
	}

	@Override
	public void putByte(byte value) {
		setter.setByte(base, value);
	}

}
