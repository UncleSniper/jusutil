package org.unclesniper.util.j8;

import java.io.IOException;

public class SinkIOAction<ValueT> implements IOAction {

	private ValueT value;

	private IOObjectSink<? super ValueT> sink;

	public SinkIOAction(ValueT value, IOObjectSink<? super ValueT> sink) {
		this.value = value;
		this.sink = sink;
	}

	public ValueT getValue() {
		return value;
	}

	public void setValue(ValueT value) {
		this.value = value;
	}

	public IOObjectSink<? super ValueT> getSink() {
		return sink;
	}

	public void setSink(IOObjectSink<? super ValueT> sink) {
		this.sink = sink;
	}

	@Override
	public void perform() throws IOException {
		sink.putObject(value);
	}

}
