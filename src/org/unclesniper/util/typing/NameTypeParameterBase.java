package org.unclesniper.util.typing;

import java.util.List;
import org.unclesniper.util.PartialStringable;

public interface NameTypeParameterBase extends PartialStringable {

	String getParameterName();

	List<ManifestNameType> getParameterUpperBoundNames();

}
