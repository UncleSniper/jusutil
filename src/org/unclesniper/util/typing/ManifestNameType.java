package org.unclesniper.util.typing;

import java.util.List;

public interface ManifestNameType extends NameTypeLike {

	GenericTypeName getGenericTypeName();

	List<? extends NameTypeArgument> getNameTypeArguments();

	InstantiableNameType asInstantiableNameType();

	NameTypeConstraint asNameTypeConstraint();

}
