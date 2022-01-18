package org.unclesniper.util.typing;

public interface ReferenceNameTypeArgument extends UnboundedNameTypeArgument {

	String getReferencedParameterName();

	NameTypeParameter getReferencedTypeParameter();

}
