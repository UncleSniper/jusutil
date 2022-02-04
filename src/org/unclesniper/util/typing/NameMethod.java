package org.unclesniper.util.typing;

import java.util.List;

public interface NameMethod extends GenericMethodName {

	ManifestNameType getReturnTypeName();

	List<ManifestNameType> getParameterTypeNames();

	List<NameMethodParameter> getNameParameters();

	List<ManifestNameType> getExceptionTypeNames();

}
