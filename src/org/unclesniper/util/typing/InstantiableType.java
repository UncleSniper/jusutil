package org.unclesniper.util.typing;

import java.util.List;

public interface InstantiableType extends InstantiableNameType, ManifestType {

	List<UnboundedTypeArgument> getUnboundedTypeArguments();

}
