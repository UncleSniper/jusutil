package org.unclesniper.util;

public enum CascadingEquality {

	EQUAL(true, true),
	UNEQUAL(false, true),
	UNKNOWN(true, false);

	public final boolean equal;

	public final boolean decided;

	private CascadingEquality(boolean equal, boolean decided) {
		this.equal = equal;
		this.decided = decided;
	}

}
