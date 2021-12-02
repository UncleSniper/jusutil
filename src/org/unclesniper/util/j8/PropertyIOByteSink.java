package org.unclesniper.util.j8;

import java.io.IOException;

public class PropertyIOByteSink<BaseT> implements IOByteSink {

	private BaseT base;

	private IOByteSetter<? super BaseT> setter;

	public PropertyIOByteSink(BaseT base, IOByteSetter<? super BaseT> setter) {
		this.base = base;
		this.setter = setter;
	}

	public BaseT getBase() {
		return base;
	}

	public void setBase(BaseT base) {
		this.base = base;
	}

	public IOByteSetter<? super BaseT> getSetter() {
		return setter;
	}

	public void setSetter(IOByteSetter<? super BaseT> setter) {
		this.setter = setter;
	}

	@Override
	public void putByte(byte value) throws IOException {
		setter.setByte(base, value);
	}

}
