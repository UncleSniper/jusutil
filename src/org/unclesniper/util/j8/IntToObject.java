package org.unclesniper.util.j8;

public interface IntToObject<ReturnT> extends IOIntToObject<ReturnT> {

	@Override
	ReturnT apply(int arg);

}
