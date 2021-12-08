package org.unclesniper.util.j8;

public interface ShortToObject<ReturnT> extends IOShortToObject<ReturnT> {

	@Override
	ReturnT apply(short arg);

}
