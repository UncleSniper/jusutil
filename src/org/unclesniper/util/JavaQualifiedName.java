package org.unclesniper.util;

import java.util.List;
import java.util.LinkedList;
import java.util.Collections;

import static org.unclesniper.util.ArgUtils.notNull;
import static org.unclesniper.util.collection.CollectionUtils.copy;

public class JavaQualifiedName extends AbstractPartialStringable {

	private final List<String> segments = new LinkedList<String>();

	public JavaQualifiedName(Iterable<String> segments) {
		copy(segments, "segments", this.segments);
		if(this.segments.isEmpty())
			throw new IllegalArgumentException("Empty sequence is illegal Java qualified-name");
	}

	public JavaQualifiedName(String name) {
		JavaUtils.splitQualifiedName(name, segments::add);
	}

	protected JavaQualifiedName() {}

	protected JavaQualifiedName(JavaQualifiedName that) {
		this(notNull(that, "that").segments);
	}

	public List<String> getSegments() {
		return Collections.unmodifiableList(segments);
	}

	protected final void addSegment(String segment) {
		segments.add(notNull(segment, "segment"));
	}

	public JavaQualifiedName popName() {
		List<String> parent = segments.subList(0, segments.size());
		if(parent.isEmpty())
			throw new IllegalStateException("Cannot pop Java qualified-name: No segments would remain");
		return new JavaQualifiedName(parent);
	}

	@Override
	public void toString(StringBuilder sink) {
		notNull(sink, "sink");
		boolean first = true;
		for(String segment : segments) {
			if(first)
				first = false;
			else
				sink.append('.');
			sink.append(segment);
		}
	}

}
