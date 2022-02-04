package org.unclesniper.util.typing;

import java.util.List;

public interface NameTypeConstraint extends ManifestNameType {

	List<NameTypeArgument> getConstraintNameTypeArguments();

}
