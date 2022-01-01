package org.unclesniper.util;

public enum CascadingEquality {

	EQUAL(true),
	UNEQUAL(false),
	UNKNOWN(true);

	public final boolean equal;

	private CascadingEquality(boolean equal) {
		this.equal = equal;
	}

}
