package org.unclesniper.util.typing;

import java.util.List;

public interface GenericType extends TypeLike, GenericTypeName {

	List<TypeParameter> getTypeParameters();

}
