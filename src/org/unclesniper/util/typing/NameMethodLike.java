package org.unclesniper.util.typing;

import org.unclesniper.util.PartialStringable;

public interface NameMethodLike extends PartialStringable {

	String getMethodName();

	NameTypeLike getDeclaringTypeName();

	boolean isConstructor();

}
