package org.unclesniper.util.typing;

import org.unclesniper.util.AbstractPartialStringable;

import static org.unclesniper.util.ArgUtils.notNull;
import static org.unclesniper.util.PropertyUtils.requireSet;

public abstract class AbstractTypeArgument extends AbstractPartialStringable implements TypeArgument {

	private final TypeParameter parameter;

	public AbstractTypeArgument(TypeParameter parameter) {
		this.parameter = notNull(parameter, "parameter");
	}

	@Override
	public TypeParameter getNameTypeParameter() {
		return parameter;
	}

	@Override
	public TypeParameter getTypeParameter() {
		return parameter;
	}

	@Override
	public TypeParameter getNameTypeParameterBase() {
		return parameter;
	}

	private void wrongKind(TypeArgumentKind expectedKind) {
		throw new ClassCastException("Type argument for parameter '" + requireSet(parameter.getParameterName(),
				"parameterName", parameter) + "' to type '" + requireSet(parameter.getDependingTypeName(),
				"dependingTypeName", parameter) + "' was expected to be of kind " + expectedKind.name()
				+ ", but is actually of kind " + requireSet(getTypeArgumentKind(), "typeArgumentKind", this).name());
	}

	@Override
	public BoundedTypeArgument asBoundedNameTypeArgument() {
		return asBoundedTypeArgument();
	}

	@Override
	public TypeTypeArgument asTypeNameTypeArgument() {
		return asTypeTypeArgument();
	}

	@Override
	public ReferenceTypeArgument asReferenceNameTypeArgument() {
		return asReferenceTypeArgument();
	}

	@Override
	public BoundedTypeArgument asBoundedTypeArgument() {
		wrongKind(TypeArgumentKind.BOUNDED);
		return null;
	}

	@Override
	public TypeTypeArgument asTypeTypeArgument() {
		wrongKind(TypeArgumentKind.TYPE);
		return null;
	}

	@Override
	public ReferenceTypeArgument asReferenceTypeArgument() {
		wrongKind(TypeArgumentKind.REFERENCE);
		return null;
	}

}
