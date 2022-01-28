package org.unclesniper.util.typing;

public interface ReferenceNameMethodTypeArgument
		extends UnboundedNameMethodTypeArgument, ReferenceNameTypeArgumentBase {

	NameMethodTypeParameter getReferencedTypeParameterName();

}
