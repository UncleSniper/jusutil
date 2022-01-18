package org.unclesniper.util.typing;

import java.util.List;

public interface GenericTypeName extends NameTypeLike {

	List<NameTypeParameter> getNameTypeParameters();

	default String getCompleteTypeName() {
		return this.toString();
	}

}
