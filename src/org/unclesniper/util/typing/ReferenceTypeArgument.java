package org.unclesniper.util.typing;

public interface ReferenceTypeArgument extends ReferenceNameTypeArgument, UnboundedTypeArgument {

	@Override
	TypeParameter getReferencedTypeParameter();

}
