package org.unclesniper.util.j8;

public interface BooleanToObject<ReturnT> extends IOBooleanToObject<ReturnT> {

	@Override
	ReturnT apply(boolean arg);

}
