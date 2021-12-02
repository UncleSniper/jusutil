package org.unclesniper.util.j8;

import java.io.IOException;

public class PropertyIOFloatSink<BaseT> implements IOFloatSink {

	private BaseT base;

	private IOFloatSetter<? super BaseT> setter;

	public PropertyIOFloatSink(BaseT base, IOFloatSetter<? super BaseT> setter) {
		this.base = base;
		this.setter = setter;
	}

	public BaseT getBase() {
		return base;
	}

	public void setBase(BaseT base) {
		this.base = base;
	}

	public IOFloatSetter<? super BaseT> getSetter() {
		return setter;
	}

	public void setSetter(IOFloatSetter<? super BaseT> setter) {
		this.setter = setter;
	}

	@Override
	public void putFloat(float value) throws IOException {
		setter.setFloat(base, value);
	}

}
