package org.unclesniper.util.typing;

public interface TypeLike extends NameTypeLike {

	Class<?> getType(ClassLoader scope);

}
