package org.unclesniper.util.typing;


import static org.unclesniper.util.ArgUtils.notNull;

public class SimpleBoundedNameTypeArgument extends AbstractNameTypeArgument implements BoundedNameTypeArgument {

	private final boolean lowerBound;

	private final NameTypeConstraint typeConstraint;

	public SimpleBoundedNameTypeArgument(NameTypeParameter parameter, boolean lowerBound,
			NameTypeConstraint typeConstraint) {
		super(parameter);
		this.lowerBound = lowerBound;
		this.typeConstraint = notNull(typeConstraint, "typeConstraint");
	}

	@Override
	public SimpleBoundedNameTypeArgument asBoundedNameTypeArgument() {
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
	public NameTypeConstraint getNameBoundConstraint() {
		return typeConstraint;
	}

	@Override
	public void toString(StringBuilder sink) {
		notNull(sink, "sink").append("? ");
		sink.append(lowerBound ? "super " : "extends ");
		typeConstraint.toString(sink);
	}

}
