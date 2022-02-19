package org.unclesniper.util.j8;

import java.io.IOException;

import static org.unclesniper.util.ArgUtils.notNull;

@FunctionalInterface
public interface IOByteToLong {

	long apply(byte arg) throws IOException;

	default IOByteToByte ioThen(IOLongToByte other) {
		notNull(other, "other");
		return arg -> other.apply(this.apply(arg));
	}

	default IOByteToShort ioThen(IOLongToShort other) {
		notNull(other, "other");
		return arg -> other.apply(this.apply(arg));
	}

	default IOByteToInt ioThen(IOLongToInt other) {
		notNull(other, "other");
		return arg -> other.apply(this.apply(arg));
	}

	default IOByteToLong ioThen(IOLongToLong other) {
		notNull(other, "other");
		return arg -> other.apply(this.apply(arg));
	}

	default IOByteToFloat ioThen(IOLongToFloat other) {
		notNull(other, "other");
		return arg -> other.apply(this.apply(arg));
	}

	default IOByteToDouble ioThen(IOLongToDouble other) {
		notNull(other, "other");
		return arg -> other.apply(this.apply(arg));
	}

	default IOByteToBoolean ioThen(IOLongToBoolean other) {
		notNull(other, "other");
		return arg -> other.apply(this.apply(arg));
	}

	default <UltimateT> IOByteToObject<UltimateT> ioThen(IOLongToObject<? extends UltimateT> other) {
		notNull(other, "other");
		return arg -> other.apply(this.apply(arg));
	}

}
