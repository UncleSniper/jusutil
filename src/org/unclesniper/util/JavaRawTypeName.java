package org.unclesniper.util;

import static org.unclesniper.util.ArgUtils.notNull;
import static org.unclesniper.util.ArgUtils.notNegative;

public class JavaRawTypeName extends JavaQualifiedName {

	private final int arrayDepth;

	public JavaRawTypeName(Iterable<String> segments, int arrayDepth) {
		super(segments);
		this.arrayDepth = notNegative(arrayDepth, "arrayDepth");
	}

	public JavaRawTypeName(String componentName, int arrayDepth) {
		super(notNull(componentName, "componentName"));
		this.arrayDepth = notNegative(arrayDepth, "arrayDepth");
	}

	public JavaRawTypeName(String name) {
		arrayDepth = JavaUtils.splitRawTypeName(name, this::addSegment);
	}

	protected JavaRawTypeName(int arrayDepth) {
		this.arrayDepth = notNegative(arrayDepth, "arrayDepth");
	}

	private JavaRawTypeName(JavaRawTypeName that, int arrayDepth) {
		super(that);
		this.arrayDepth = arrayDepth;
	}

	protected JavaRawTypeName(JavaRawTypeName that) {
		super(that);
		arrayDepth = that.arrayDepth;
	}

	public int getArrayDepth() {
		return arrayDepth;
	}

	@Override
	public JavaQualifiedName popName() {
		if(arrayDepth > 0)
			throw new IllegalStateException("Cannot pop Java raw-type-name: Would discard array qualifiers");
		return super.popName();
	}

	public JavaRawTypeName popArray() {
		if(arrayDepth == 0)
			throw new IllegalStateException("Cannot pop Java raw-type-name: No more array qualifiers remain");
		return new JavaRawTypeName(this, arrayDepth - 1);
	}

	public JavaQualifiedName dropArray() {
		return new JavaQualifiedName(this);
	}

	@Override
	public void toString(StringBuilder sink) {
		super.toString(sink);
		for(int i = 0; i < arrayDepth; ++i)
			sink.append("[]");
	}

}
