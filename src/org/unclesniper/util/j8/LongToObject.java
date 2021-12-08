package org.unclesniper.util.j8;

public interface LongToObject<ReturnT> extends IOLongToObject<ReturnT> {

	@Override
	ReturnT apply(long arg);

}
