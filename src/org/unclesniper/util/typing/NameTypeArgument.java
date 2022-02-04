package org.unclesniper.util.typing;

public interface NameTypeArgument extends NameTypeArgumentBase {

	NameTypeParameter getNameTypeParameter();

	BoundedNameTypeArgument asBoundedNameTypeArgument();

	TypeNameTypeArgument asTypeNameTypeArgument();

	ReferenceNameTypeArgument asReferenceNameTypeArgument();

}
