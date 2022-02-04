package org.unclesniper.util.typing;

public interface MethodTypeParameter extends NameMethodTypeParameter, TypeParameterBase {

	GenericMethod getDependingMethod();

}
