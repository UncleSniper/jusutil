package org.unclesniper.util.typing;

public interface NameMethodTypeArgument extends NameTypeArgumentBase {

	NameMethodTypeParameter getNameMethodTypeParameter();

	BoundedNameMethodTypeArgument asBoundedNameMethodTypeArgument();

	TypeNameMethodTypeArgument asTypeNameMethodTypeArgument();

	ReferenceNameMethodTypeArgument asReferenceNameMethodTypeArgument();

}
