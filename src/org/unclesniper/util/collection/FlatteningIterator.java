package org.unclesniper.util.collection;

import java.util.Iterator;
import java.util.function.Function;
import java.util.NoSuchElementException;

import static org.unclesniper.util.ArgUtils.notNull;

public class FlatteningIterator<OuterT, InnerT> implements Iterator<InnerT> {

	private final Iterator<OuterT> outerIterator;

	private final Function<? super OuterT, ? extends Iterator<? extends InnerT>> iterate;

	private Iterator<? extends InnerT> innerIterator;

	public FlatteningIterator(Iterator<OuterT> outerIterator,
			Function<? super OuterT, ? extends Iterator<? extends InnerT>> iterate) {
		this.outerIterator = notNull(outerIterator, "outerIterator");
		this.iterate = notNull(iterate, "iterate");
		advance();
	}

	private void advance() {
		while(innerIterator == null || !innerIterator.hasNext()) {
			if(!outerIterator.hasNext()) {
				innerIterator = null;
				break;
			}
			OuterT outer = outerIterator.next();
			if(outer == null)
				continue;
			innerIterator = iterate.apply(outer);
		}
	}

	@Override
	public boolean hasNext() {
		return innerIterator != null && innerIterator.hasNext();
	}

	@Override
	public InnerT next() {
		if(innerIterator == null || !innerIterator.hasNext())
			throw new NoSuchElementException();
		InnerT inner = innerIterator.next();
		advance();
		return inner;
	}

	public static <InnerT, OuterT extends Iterable<InnerT>> Iterator<InnerT> of(Iterator<OuterT> outerIterator) {
		return new FlatteningIterator<OuterT, InnerT>(outerIterator, CollectionUtils::iterating);
	}

	public static <InnerT, OuterT extends Iterable<InnerT>> Iterator<InnerT> of(Iterable<OuterT> outer) {
		return new FlatteningIterator<OuterT, InnerT>(notNull(outer, "outer").iterator(),
				CollectionUtils::iterating);
	}

}
