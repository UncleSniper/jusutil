package org.unclesniper.util;

import static org.unclesniper.util.ArgUtils.safePlus;
import static org.unclesniper.util.ArgUtils.notNegative;

public final class IntProgression {

	private static final int FL_MASK
			= ProgressionFlags.FL_ALLOW_NEGATIVE_VALUE
			| ProgressionFlags.FL_ALLOW_NEGATIVE_DELTA;

	private int value;

	private int flags;

	public IntProgression(int value, int flags) {
		if((flags & ProgressionFlags.FL_ALLOW_NEGATIVE_VALUE) == 0)
			notNegative(value, "value");
		this.value = value;
		this.flags = flags & IntProgression.FL_MASK;
	}

	public int getFlags() {
		return flags;
	}

	public void setFlags(int flags) {
		this.flags = flags & IntProgression.FL_MASK;
	}

	public void addFlags(int flags) {
		this.flags |= flags & IntProgression.FL_MASK;
	}

	public void removeFlags(int flags) {
		this.flags &= ~flags;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		if((flags & ProgressionFlags.FL_ALLOW_NEGATIVE_VALUE) == 0)
			notNegative(value, "value");
		this.value = value;
	}

	public void add(int delta) {
		if((flags & ProgressionFlags.FL_ALLOW_NEGATIVE_DELTA) == 0)
			notNegative(delta, "delta");
		value = safePlus(value, delta, "Progression exceeds range of int");
	}

}
