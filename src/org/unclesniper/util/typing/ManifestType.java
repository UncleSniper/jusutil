package org.unclesniper.util.typing;

import java.util.List;

public interface ManifestType extends ManifestNameType, TypeLike {

	GenericType getGenericType();

	List<? extends TypeArgument> getTypeArguments();

	boolean isInstantiableType();

	InstantiableType asInstantiableType();

	TypeConstraint asTypeConstraint();

}
