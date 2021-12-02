package org.unclesniper.util.j8;

import java.io.IOException;

public class PropertyIOObjectSink<BaseT, PropertyT> implements IOObjectSink<PropertyT> {

	private BaseT base;

	private IOObjectSetter<? super BaseT, ? super PropertyT> setter;

	public PropertyIOObjectSink(BaseT base, IOObjectSetter<? super BaseT, ? super PropertyT> setter) {
		this.base = base;
		this.setter = setter;
	}

	public BaseT getBase() {
		return base;
	}

	public void setBase(BaseT base) {
		this.base = base;
	}

	public IOObjectSetter<? super BaseT, ? super PropertyT> getSetter() {
		return setter;
	}

	public void setSetter(IOObjectSetter<? super BaseT, ? super PropertyT> setter) {
		this.setter = setter;
	}

	@Override
	public void putObject(PropertyT value) throws IOException {
		setter.setProperty(base, value);
	}

}
