package org.unclesniper.util.typing;

import org.unclesniper.util.PartialStringable;

public interface NameTypeArgument extends PartialStringable {

	NameTypeParameter getNameTypeParameter();

	TypeArgumentKind getTypeArgumentKind();

	BoundedNameTypeArgument asBoundedNameTypeArgument();

	TypeNameTypeArgument asTypeNameTypeArgument();

	ReferenceNameTypeArgument asReferenceNameTypeArgument();

}
