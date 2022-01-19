package org.unclesniper.util.typing;

import java.util.List;

public interface Method extends NameMethod, GenericMethod {

	ManifestType getReturnType();

	List<ManifestType> getParameterTypes();

	List<MethodParameter> getParameters();

	List<ManifestType> getExceptionTypes();

}
