package org.unclesniper.util.typing;

public interface TypeArgument extends NameTypeArgument {

	TypeParameter getTypeParameter();

	BoundedTypeArgument asBoundedTypeArgument();

	TypeTypeArgument asTypeTypeArgument();

	ReferenceTypeArgument asReferenceTypeArgument();

}
