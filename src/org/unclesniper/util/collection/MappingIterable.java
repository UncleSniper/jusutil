package org.unclesniper.util.collection;

import java.util.Iterator;
import java.util.function.Function;

import static org.unclesniper.util.ArgUtils.notNull;

public class MappingIterable<DomainT, CodomainT> implements Iterable<CodomainT> {

	private final Iterable<? extends DomainT> iterable;

	private final Function<? super DomainT, ? extends CodomainT> mapping;

	public MappingIterable(Iterable<? extends DomainT> iterable,
			Function<? super DomainT, ? extends CodomainT> mapping) {
		this.iterable = notNull(iterable, "iterable");
		this.mapping = notNull(mapping, "mapping");
	}

	@Override
	public Iterator<CodomainT> iterator() {
		return new MappingIterator<DomainT, CodomainT>(iterable.iterator(), mapping);
	}

}
