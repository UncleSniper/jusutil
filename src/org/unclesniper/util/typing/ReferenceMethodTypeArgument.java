package org.unclesniper.util.typing;

public interface ReferenceMethodTypeArgument
		extends ReferenceNameMethodTypeArgument, UnboundedMethodTypeArgument {

	MethodTypeParameter getReferencedTypeParameter();

}
