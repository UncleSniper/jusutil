package org.unclesniper.util.typing;

import java.util.List;
import org.unclesniper.util.PartialStringable;

public interface NameTypeParameter extends PartialStringable {

	GenericTypeName getDependingTypeName();

	String getParameterName();

	List<ManifestNameType> getParameterUpperBoundNames();

}
