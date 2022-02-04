package org.unclesniper.util.typing;

public interface BoundedNameTypeArgumentBase extends NameTypeArgumentBase {

	boolean isLowerBound();

	NameTypeConstraint getNameBoundConstraint();

}
