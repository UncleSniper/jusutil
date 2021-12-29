package org.unclesniper.util.collection;

import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.Collection;
import java.util.Collections;

import static org.unclesniper.util.ArgUtils.notNull;

public class TypeMap<UpperBoundT> {

	private final Map<Class<? extends UpperBoundT>, Object> bindings
			= new HashMap<Class<? extends UpperBoundT>, Object>();

	private boolean checkType;

	private Class<UpperBoundT> upperBoundClass;

	public TypeMap() {}

	public boolean isCheckType() {
		return checkType;
	}

	public void setCheckType(boolean checkType) {
		this.checkType = checkType;
	}

	public Class<UpperBoundT> getUpperBoundClass() {
		return upperBoundClass;
	}

	public void setUpperBoundClass(Class<UpperBoundT> upperBoundClass) {
		this.upperBoundClass = upperBoundClass;
	}

	public <T extends UpperBoundT> void put(Class<T> type, T instance) {
		notNull(type, "type");
		if(upperBoundClass != null && !upperBoundClass.isAssignableFrom(type))
			throw new IllegalArgumentException("Type '" + type.getName() + "' does not conform to upper bound '"
					+ upperBoundClass.getName() + '\'');
		if(checkType && instance != null && !type.isInstance(instance))
			throw new IllegalArgumentException("Instance object of type '" + instance.getClass().getName()
					+ "' is not actually of claimed type '" + type.getName() + '\'');
		if(instance != null)
			bindings.put(type, instance);
		else
			bindings.remove(type);
	}

	@SuppressWarnings("unchecked")
	public <T extends UpperBoundT> T get(Class<T> type) {
		return (T)bindings.get(type);
	}

	public void clear() {
		bindings.clear();
	}

	public Set<Class<? extends UpperBoundT>> keySet() {
		return bindings.keySet();
	}

	public boolean remove(Class<? extends UpperBoundT> type) {
		return bindings.remove(type) != null;
	}

	public Set<Map.Entry<Class<? extends UpperBoundT>, Object>> entrySet() {
		return Collections.unmodifiableSet(bindings.entrySet());
	}

	public Collection<Object> values() {
		return Collections.unmodifiableCollection(bindings.values());
	}

}
