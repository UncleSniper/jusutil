package org.unclesniper.util.typing;

import java.util.List;

public interface GenericMethodName extends NameMethodLike {

	List<NameMethodTypeParameter> getNameTypeParameters();

	default String getCompleteMethodName() {
		return this.toString();
	}

}
