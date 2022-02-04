package org.unclesniper.util.typing;

public interface MethodTypeArgument extends NameMethodTypeArgument {

	MethodTypeParameter getMethodTypeParameter();

	BoundedMethodTypeArgument asBoundedMethodTypeArgument();

	TypeMethodTypeArgument asTypeMethodTypeArgument();

	ReferenceMethodTypeArgument asReferenceMethodTypeArgument();

}
