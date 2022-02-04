package org.unclesniper.util.typing;

import static org.unclesniper.util.ArgUtils.notNull;
import static org.unclesniper.util.PropertyUtils.requireSet;

public class SimpleReferenceTypeArgument extends AbstractTypeArgument implements ReferenceTypeArgument {

	public SimpleReferenceTypeArgument(TypeParameter parameter) {
		super(parameter);
	}

	@Override
	public TypeParameter getReferencedTypeParameter() {
		return getTypeParameter();
	}

	@Override
	public TypeParameter getReferencedTypeParameterName() {
		return getTypeParameter();
	}

	@Override
	public TypeArgumentKind getTypeArgumentKind() {
		return TypeArgumentKind.REFERENCE;
	}

	@Override
	public String getReferencedParameterName() {
		return requireSet(getTypeParameter(), "typeParameter", this).getParameterName();
	}

	@Override
	public void toString(StringBuilder sink) {
		notNull(sink, "sink").append(requireSet(getReferencedParameterName(), "referencedParameterName", this));
	}

}
