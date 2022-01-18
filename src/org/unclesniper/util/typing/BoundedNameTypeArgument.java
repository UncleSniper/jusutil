package org.unclesniper.util.typing;

public interface BoundedNameTypeArgument extends NameTypeArgument {

	boolean isLowerBound();

	NameTypeConstraint getNameBoundConstraint();

}
