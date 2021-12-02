package org.unclesniper.util.j8;

import java.io.IOException;

public class PropertyIOShortSink<BaseT> implements IOShortSink {

	private BaseT base;

	private IOShortSetter<? super BaseT> setter;

	public PropertyIOShortSink(BaseT base, IOShortSetter<? super BaseT> setter) {
		this.base = base;
		this.setter = setter;
	}

	public BaseT getBase() {
		return base;
	}

	public void setBase(BaseT base) {
		this.base = base;
	}

	public IOShortSetter<? super BaseT> getSetter() {
		return setter;
	}

	public void setSetter(IOShortSetter<? super BaseT> setter) {
		this.setter = setter;
	}

	@Override
	public void putShort(short value) throws IOException {
		setter.setShort(base, value);
	}

}
