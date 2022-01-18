package org.unclesniper.util.typing;

public interface BoundedTypeArgument extends BoundedNameTypeArgument, TypeArgument {

	TypeConstraint getBoundConstraint();

}
