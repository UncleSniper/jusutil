package org.unclesniper.util.typing;

import java.util.List;

public interface GenericMethod extends MethodLike, GenericMethodName {

	List<TypeParameter> getTypeParameters();

}
