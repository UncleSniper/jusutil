package org.unclesniper.util.collection;

import java.util.Iterator;
import java.util.function.Function;

import static org.unclesniper.util.ArgUtils.notNull;

public class MappingIterator<DomainT, CodomainT> implements Iterator<CodomainT> {

	private final Iterator<? extends DomainT> iterator;

	private final Function<? super DomainT, ? extends CodomainT> mapping;

	public MappingIterator(Iterator<? extends DomainT> iterator,
			Function<? super DomainT, ? extends CodomainT> mapping) {
		this.iterator = notNull(iterator, "iterator");
		this.mapping = notNull(mapping, "mapping");
	}

	@Override
	public boolean hasNext() {
		return iterator.hasNext();
	}

	@Override
	public CodomainT next() {
		return mapping.apply(iterator.next());
	}

	@Override
	public void remove() {
		iterator.remove();
	}

}
