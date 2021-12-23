package org.unclesniper.util.collection;

import java.util.Iterator;
import java.util.function.Function;

import static org.unclesniper.util.ArgUtils.notNull;

public class FlatteningIterable<OuterT, InnerT> implements Iterable<InnerT> {

	private final Iterable<? extends OuterT> outerIterable;

	private final Function<? super OuterT, ? extends Iterator<? extends InnerT>> iterateInner;

	public FlatteningIterable(Iterable<? extends OuterT> outerIterable,
			Function<? super OuterT, ? extends Iterator<? extends InnerT>> iterateInner) {
		this.outerIterable = notNull(outerIterable, "outerIterable");
		this.iterateInner = notNull(iterateInner, "iterateInner");
	}

	@Override
	public Iterator<InnerT> iterator() {
		return new FlatteningIterator<OuterT, InnerT>(outerIterable.iterator(), iterateInner);
	}

}
