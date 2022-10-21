package org.unclesniper.util;

import static org.unclesniper.util.ArgUtils.safePlus;
import static org.unclesniper.util.ArgUtils.notNegative;

public final class LongProgression {

	private static final int FL_MASK
			= ProgressionFlags.FL_ALLOW_NEGATIVE_VALUE
			| ProgressionFlags.FL_ALLOW_NEGATIVE_DELTA;

	private long value;

	private int flags;

	public LongProgression(long value, int flags) {
		if((flags & ProgressionFlags.FL_ALLOW_NEGATIVE_VALUE) == 0)
			notNegative(value, "value");
		this.value = value;
		this.flags = flags & LongProgression.FL_MASK;
	}

	public int getFlags() {
		return flags;
	}

	public void setFlags(int flags) {
		this.flags = flags & LongProgression.FL_MASK;
	}

	public void addFlags(int flags) {
		this.flags |= flags & LongProgression.FL_MASK;
	}

	public void removeFlags(int flags) {
		this.flags &= ~flags;
	}

	public long getValue() {
		return value;
	}

	public void setValue(long value) {
		if((flags & ProgressionFlags.FL_ALLOW_NEGATIVE_VALUE) == 0)
			notNegative(value, "value");
		this.value = value;
	}

	public void add(long delta) {
		if((flags & ProgressionFlags.FL_ALLOW_NEGATIVE_DELTA) == 0)
			notNegative(delta, "delta");
		value = safePlus(value, delta, "Progression exceeds range of long");
	}

}
