package org.unclesniper.util.typing;

import static org.unclesniper.util.ArgUtils.notNull;

public class SimpleBoundedTypeArgument extends AbstractTypeArgument implements BoundedTypeArgument {

	private final boolean lowerBound;

	private final TypeConstraint typeConstraint;

	public SimpleBoundedTypeArgument(TypeParameter parameter, boolean lowerBound, TypeConstraint typeConstraint) {
		super(parameter);
		this.lowerBound = lowerBound;
		this.typeConstraint = notNull(typeConstraint, "typeConstraint");
	}

	@Override
	public SimpleBoundedTypeArgument asBoundedTypeArgument() {
		return this;
	}

	@Override
	public TypeArgumentKind getTypeArgumentKind() {
		return TypeArgumentKind.BOUNDED;
	}

	@Override
	public boolean isLowerBound() {
		return lowerBound;
	}

	@Override
	public TypeConstraint getNameBoundConstraint() {
		return typeConstraint;
	}

	@Override
	public TypeConstraint getBoundConstraint() {
		return typeConstraint;
	}

	@Override
	public void toString(StringBuilder sink) {
		notNull(sink, "sink").append("? ");
		sink.append(lowerBound ? "super " : "extends ");
		typeConstraint.toString(sink);
	}

}
