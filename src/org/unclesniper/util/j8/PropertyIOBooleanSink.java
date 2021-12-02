package org.unclesniper.util.j8;

import java.io.IOException;

public class PropertyIOBooleanSink<BaseT> implements IOBooleanSink {

	private BaseT base;

	private IOBooleanSetter<? super BaseT> setter;

	public PropertyIOBooleanSink(BaseT base, IOBooleanSetter<? super BaseT> setter) {
		this.base = base;
		this.setter = setter;
	}

	public BaseT getBase() {
		return base;
	}

	public void setBase(BaseT base) {
		this.base = base;
	}

	public IOBooleanSetter<? super BaseT> getSetter() {
		return setter;
	}

	public void setSetter(IOBooleanSetter<? super BaseT> setter) {
		this.setter = setter;
	}

	@Override
	public void putBoolean(boolean value) throws IOException {
		setter.setBoolean(base, value);
	}

}
