package org.unclesniper.util.typing;

import static org.unclesniper.util.ArgUtils.notNull;
import static org.unclesniper.util.PropertyUtils.requireSet;

public class SimpleReferenceNameTypeArgument extends AbstractNameTypeArgument implements ReferenceNameTypeArgument {

	public SimpleReferenceNameTypeArgument(NameTypeParameter parameter) {
		super(parameter);
	}

	@Override
	public NameTypeParameter getReferencedTypeParameterName() {
		return getNameTypeParameter();
	}

	@Override
	public TypeArgumentKind getTypeArgumentKind() {
		return TypeArgumentKind.REFERENCE;
	}

	@Override
	public String getReferencedParameterName() {
		return requireSet(getNameTypeParameter(), "typeParameter", this).getParameterName();
	}

	@Override
	public void toString(StringBuilder sink) {
		notNull(sink, "sink").append(requireSet(getReferencedParameterName(), "referencedParameterName", this));
	}

}
