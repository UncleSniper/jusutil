package org.unclesniper.util.typing;

import org.unclesniper.util.PartialStringable;

public interface NameTypeArgumentBase extends PartialStringable {

	TypeArgumentKind getTypeArgumentKind();

	NameTypeParameterBase getNameTypeParameterBase();

}
