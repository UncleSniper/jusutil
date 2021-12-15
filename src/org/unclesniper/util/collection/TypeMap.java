package org.unclesniper.util.collection;

import java.util.Map;
import java.util.Set;
import java.util.HashMap;

import static org.unclesniper.util.ArgUtils.notNull;

public class TypeMap<UpperBoundT> {

	private final Map<Class<?>, Object> bindings = new HashMap<Class<?>, Object>();

	private boolean checkType;

	public TypeMap() {}

	public boolean isCheckType() {
		return checkType;
	}

	public void setCheckType(boolean checkType) {
		this.checkType = checkType;
	}

	public <T> void put(Class<T> type, T instance) {
		notNull(type, "type");
		if(checkType && instance != null && !type.isInstance(instance))
			throw new IllegalArgumentException("Instance object of type '" + instance.getClass().getName()
					+ "' is not actually of claimed type '" + type.getName() + '\'');
		if(instance != null)
			bindings.put(type, instance);
		else
			bindings.remove(type);
	}

	@SuppressWarnings("unchecked")
	public <T> T get(Class<T> type) {
		return (T)bindings.get(type);
	}

	public void clear() {
		bindings.clear();
	}

	public Set<Class<?>> keySet() {
		return bindings.keySet();
	}

	public boolean remove(Class<?> type) {
		return bindings.remove(type) != null;
	}

}
