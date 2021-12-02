package org.unclesniper.util.j8;

public class SinkAction<ValueT> implements Action {

	private ValueT value;

	private ObjectSink<? super ValueT> sink;

	public SinkAction(ValueT value, ObjectSink<? super ValueT> sink) {
		this.value = value;
		this.sink = sink;
	}

	public ValueT getValue() {
		return value;
	}

	public void setValue(ValueT value) {
		this.value = value;
	}

	public ObjectSink<? super ValueT> getSink() {
		return sink;
	}

	public void setSink(ObjectSink<? super ValueT> sink) {
		this.sink = sink;
	}

	@Override
	public void perform() {
		sink.putObject(value);
	}

}
