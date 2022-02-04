package org.unclesniper.util;

public final class PropertyUtils {

	private PropertyUtils() {}

	public static <T> T requireSet(T property, String name, Object that) {
		if(name == null)
			throw new IllegalArgumentException("Argument 'name' to PropertyUtils.requireSet() must not be null");
		if(property == null)
			throw new IllegalStateException("Property '" + name + '\''
					+ (that == null ? "" : " of object of type '" + that.getClass().getName() + '\'')
					+ " has not been set");
		return property;
	}

	public static <T> T returnNotNull(T returnValue, Object that, String methodName) {
		if(methodName == null)
			throw new IllegalArgumentException("Argument 'methodName' to PropertyUtils.returnNotNull() "
					+ "must not be null");
		if(returnValue == null)
			throw new IllegalStateException("Method " + methodName + "() on object"
					+ (that == null ? "" : " of type '" + that.getClass(). getName() + '\'')
					+ " returned null");
		return returnValue;
	}

}
