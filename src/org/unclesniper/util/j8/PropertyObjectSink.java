package org.unclesniper.util.j8;

public class PropertyObjectSink<BaseT, PropertyT> implements ObjectSink<PropertyT> {

	private BaseT base;

	private ObjectSetter<? super BaseT, ? super PropertyT> setter;

	public PropertyObjectSink(BaseT base, ObjectSetter<? super BaseT, ? super PropertyT> setter) {
		this.base = base;
		this.setter = setter;
	}

	public BaseT getBase() {
		return base;
	}

	public void setBase(BaseT base) {
		this.base = base;
	}

	public ObjectSetter<? super BaseT, ? super PropertyT> getSetter() {
		return setter;
	}

	public void setSetter(ObjectSetter<? super BaseT, ? super PropertyT> setter) {
		this.setter = setter;
	}

	@Override
	public void putObject(PropertyT value) {
		setter.setProperty(base, value);
	}

}
