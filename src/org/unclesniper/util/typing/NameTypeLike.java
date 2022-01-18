package org.unclesniper.util.typing;

import org.unclesniper.util.JavaRawTypeName;
import org.unclesniper.util.PartialStringable;

public interface NameTypeLike extends PartialStringable {

	String getTypeSimpleName();

	JavaRawTypeName getTypeQualifiedName();

	boolean isArrayType();

}
