package org.unclesniper.util.typing;

public interface TypeParameter extends NameTypeParameter, TypeParameterBase {

	GenericType getDependingType();

}
