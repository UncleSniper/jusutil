package org.unclesniper.util.collection;

import java.util.Iterator;
import java.util.function.Function;
import java.util.function.BiFunction;

import static org.unclesniper.util.ArgUtils.notNull;

public class CoalescingIterable<OuterT, CookieT, InnerT, UltimateT> implements Iterable<UltimateT> {

	private final Iterable<? extends OuterT> outerIterable;

	private final Function<? super OuterT, ? extends CookieT> extractCookie;

	private final Function<? super OuterT, ? extends Iterator<? extends InnerT>> iterateInner;

	private final BiFunction<? super CookieT, ? super InnerT, ? extends UltimateT> combine;

	public CoalescingIterable(Iterable<? extends OuterT> outerIterable,
		Function<? super OuterT, ? extends CookieT> extractCookie,
		Function<? super OuterT, ? extends Iterator<? extends InnerT>> iterateInner,
		BiFunction<? super CookieT, ? super InnerT, ? extends UltimateT> combine) {
		this.outerIterable = notNull(outerIterable, "outerIterable");
		this.extractCookie = extractCookie;
		this.iterateInner = notNull(iterateInner, "iterateInner");
		this.combine = notNull(combine, "combine");
	}

	@Override
	public Iterator<UltimateT> iterator() {
		return new CoalescingIterator<OuterT, CookieT, InnerT, UltimateT>(outerIterable.iterator(),
				extractCookie, iterateInner, combine);
	}

}
