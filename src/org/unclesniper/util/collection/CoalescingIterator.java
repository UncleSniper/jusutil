package org.unclesniper.util.collection;

import java.util.Iterator;
import java.util.function.Function;
import java.util.function.BiFunction;
import java.util.NoSuchElementException;

import static org.unclesniper.util.ArgUtils.notNull;

public class CoalescingIterator<OuterT, CookieT, InnerT, UltimateT> implements Iterator<UltimateT> {

	private final Iterator<? extends OuterT> outerIterator;

	private final Function<? super OuterT, ? extends CookieT> extractCookie;

	private final Function<? super OuterT, ? extends Iterator<? extends InnerT>> iterate;

	private final BiFunction<? super CookieT, ? super InnerT, ? extends UltimateT> combine;

	private Iterator<? extends InnerT> innerIterator;

	private CookieT cookie;

	public CoalescingIterator(Iterator<? extends OuterT> outerIterator,
			Function<? super OuterT, ? extends CookieT> extractCookie,
			Function<? super OuterT, ? extends Iterator<? extends InnerT>> iterate,
			BiFunction<? super CookieT, ? super InnerT, ? extends UltimateT> combine) {
		this.outerIterator = notNull(outerIterator, "outerIterator");
		this.extractCookie = extractCookie;
		this.iterate = notNull(iterate, "iterate");
		this.combine = notNull(combine, "combine");
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
			cookie = extractCookie == null ? null : extractCookie.apply(outer);
		}
	}

	@Override
	public boolean hasNext() {
		return innerIterator != null && innerIterator.hasNext();
	}

	@Override
	public UltimateT next() {
		if(innerIterator == null || !innerIterator.hasNext())
			throw new NoSuchElementException();
		InnerT inner = innerIterator.next();
		advance();
		return combine.apply(cookie, inner);
	}

}
