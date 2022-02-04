package org.unclesniper.util.typing;

import java.util.List;

public interface Type extends NameType, GenericType {

	InstantiableType getSuperclass();

	List<InstantiableType> getImplementedInterfaces();

	List<TypeMember> getMemberTypes();

	List<FieldMember> getFields();

	List<MethodMember> getMethods();

}
