package org.unclesniper.util.typing;

import java.util.List;

public interface TypeParameter extends NameTypeParameter {

	GenericType getDependingType();

	List<Class<?>> getParameterUpperBoundClasses();

	List<Class<?>> getParameterUpperBoundClasses(ClassLoader scope);

	List<ManifestType> getParameterUpperBounds();

}
