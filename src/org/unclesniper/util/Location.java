package org.unclesniper.util;

public class Location implements PartialStringable {

	private String file;

	private int line;

	private int column;

	public Location(String file, int line, int column) {
		this.file = file;
		this.line = line;
		this.column = column;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public int getLine() {
		return line;
	}

	public void setLine(int line) {
		this.line = line;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	@Override
	public void toString(StringBuilder sink) {
		ArgUtils.notNull(sink, "sink");
		if(file == null || file.length() == 0) {
			sink.append("<unknown location>");
			return;
		}
		sink.append(file);
		if(line <= 0) {
			sink.append(":<unknown line>");
			return;
		}
		sink.append(':');
		sink.append(String.valueOf(line));
		if(column > 0) {
			sink.append(':');
			sink.append(String.valueOf(column));
		}
	}

	@Override
	public String toString() {
		return PartialStringable.toString(this);
	}

}
