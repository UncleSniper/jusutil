package org.unclesniper.util.j8;

public interface ObjectP<ValueT> extends IOObjectP<ValueT> {

	@Override
	boolean testObject(ValueT value);

}
