package org.unclesniper.util.typing;

public interface ReferenceNameTypeArgument extends UnboundedNameTypeArgument, ReferenceNameTypeArgumentBase {

	NameTypeParameter getReferencedTypeParameterName();

}
