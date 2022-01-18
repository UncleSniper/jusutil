package org.unclesniper.util.typing;

import java.util.List;

public interface Type extends GenericType {

	InstantiableType getSuperclass();

	List<InstantiableType> getImplementedInterfaces();

	List<TypeMember> getMemberTypes();

}
