package org.unclesniper.util;

public abstract class AbstractPartialStringable implements PartialStringable {

	public AbstractPartialStringable() {}

	@Override
	public String toString() {
		return PartialStringable.toString(this);
	}

}
