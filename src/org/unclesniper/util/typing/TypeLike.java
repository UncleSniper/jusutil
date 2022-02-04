package org.unclesniper.util.typing;

public interface TypeLike extends NameTypeLike {

	Class<?> getTypeClass();

	Class<?> getTypeClass(ClassLoader scope);

}
