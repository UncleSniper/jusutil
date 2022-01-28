package org.unclesniper.util.typing;

import org.unclesniper.util.AbstractPartialStringable;

import static org.unclesniper.util.ArgUtils.notNull;
import static org.unclesniper.util.PropertyUtils.requireSet;

public abstract class AbstractNameTypeArgument extends AbstractPartialStringable implements NameTypeArgument {

	private final NameTypeParameter parameter;

	public AbstractNameTypeArgument(NameTypeParameter parameter) {
		this.parameter = notNull(parameter, "parameter");
	}

	@Override
	public NameTypeParameter getNameTypeParameter() {
		return parameter;
	}

	@Override
	public NameTypeParameter getNameTypeParameterBase() {
		return parameter;
	}

	private void wrongKind(TypeArgumentKind expectedKind) {
		throw new ClassCastException("Type argument for parameter '" + requireSet(parameter.getParameterName(),
				"parameterName", parameter) + "' to type '" + requireSet(parameter.getDependingTypeName(),
				"dependingTypeName", parameter) + "' was expected to be of kind " + expectedKind.name()
				+ ", but is actually of kind " + requireSet(getTypeArgumentKind(), "typeArgumentKind", this).name());
	}

	@Override
	public BoundedNameTypeArgument asBoundedNameTypeArgument() {
		wrongKind(TypeArgumentKind.BOUNDED);
		return null;
	}

	@Override
	public TypeNameTypeArgument asTypeNameTypeArgument() {
		wrongKind(TypeArgumentKind.TYPE);
		return null;
	}

	@Override
	public ReferenceNameTypeArgument asReferenceNameTypeArgument() {
		wrongKind(TypeArgumentKind.REFERENCE);
		return null;
	}

}
