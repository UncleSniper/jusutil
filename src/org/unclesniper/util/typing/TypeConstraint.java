package org.unclesniper.util.typing;

import java.util.List;

public interface TypeConstraint extends NameTypeConstraint, ManifestType {

	List<TypeArgument> getConstraintTypeArguments();

}
