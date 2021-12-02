package org.unclesniper.util.j8;

import java.io.IOException;

public class PropertyIOLongSink<BaseT> implements IOLongSink {

	private BaseT base;

	private IOLongSetter<? super BaseT> setter;

	public PropertyIOLongSink(BaseT base, IOLongSetter<? super BaseT> setter) {
		this.base = base;
		this.setter = setter;
	}

	public BaseT getBase() {
		return base;
	}

	public void setBase(BaseT base) {
		this.base = base;
	}

	public IOLongSetter<? super BaseT> getSetter() {
		return setter;
	}

	public void setSetter(IOLongSetter<? super BaseT> setter) {
		this.setter = setter;
	}

	@Override
	public void putLong(long value) throws IOException {
		setter.setLong(base, value);
	}

}
