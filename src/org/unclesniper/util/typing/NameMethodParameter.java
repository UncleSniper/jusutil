package org.unclesniper.util.typing;

import org.unclesniper.util.PartialStringable;

public interface NameMethodParameter extends PartialStringable {

	String getParameterName();

	ManifestNameType getParameterTypeName();

}
