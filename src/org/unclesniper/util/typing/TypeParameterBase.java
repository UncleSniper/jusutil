package org.unclesniper.util.typing;

import java.util.List;

public interface TypeParameterBase extends NameTypeParameterBase {

	List<Class<?>> getParameterUpperBoundClasses();

	List<Class<?>> getParameterUpperBoundClasses(ClassLoader scope);

	List<ManifestType> getParameterUpperBounds();

}
