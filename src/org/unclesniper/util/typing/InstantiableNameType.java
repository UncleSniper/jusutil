package org.unclesniper.util.typing;

import java.util.List;

public interface InstantiableNameType extends ManifestNameType {

	List<UnboundedNameTypeArgument> getUnboundedNameTypeArguments();

}
