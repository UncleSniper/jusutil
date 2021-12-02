package org.unclesniper.util.j8;

import java.io.IOException;

public class PropertyIOIntSink<BaseT> implements IOIntSink {

	private BaseT base;

	private IOIntSetter<? super BaseT> setter;

	public PropertyIOIntSink(BaseT base, IOIntSetter<? super BaseT> setter) {
		this.base = base;
		this.setter = setter;
	}

	public BaseT getBase() {
		return base;
	}

	public void setBase(BaseT base) {
		this.base = base;
	}

	public IOIntSetter<? super BaseT> getSetter() {
		return setter;
	}

	public void setSetter(IOIntSetter<? super BaseT> setter) {
		this.setter = setter;
	}

	@Override
	public void putInt(int value) throws IOException {
		setter.setInt(base, value);
	}

}
