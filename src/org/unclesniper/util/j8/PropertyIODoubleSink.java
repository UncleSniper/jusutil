package org.unclesniper.util.j8;

import java.io.IOException;

public class PropertyIODoubleSink<BaseT> implements IODoubleSink {

	private BaseT base;

	private IODoubleSetter<? super BaseT> setter;

	public PropertyIODoubleSink(BaseT base, IODoubleSetter<? super BaseT> setter) {
		this.base = base;
		this.setter = setter;
	}

	public BaseT getBase() {
		return base;
	}

	public void setBase(BaseT base) {
		this.base = base;
	}

	public IODoubleSetter<? super BaseT> getSetter() {
		return setter;
	}

	public void setSetter(IODoubleSetter<? super BaseT> setter) {
		this.setter = setter;
	}

	@Override
	public void putDouble(double value) throws IOException {
		setter.setDouble(base, value);
	}

}
