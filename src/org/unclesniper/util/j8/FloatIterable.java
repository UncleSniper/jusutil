package org.unclesniper.util.j8;

public interface FloatIterable extends IOFloatIterable, DoubleIterable {

	@Override
	FloatIterator floatIterator();

}
