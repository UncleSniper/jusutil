package org.unclesniper.util.j8;

import java.io.IOException;

import static org.unclesniper.util.ArgUtils.notNull;

@FunctionalInterface
public interface IOByteToShort {

	short apply(byte arg) throws IOException;

	default IOByteToByte ioThen(IOShortToByte other) {
		notNull(other, "other");
		return arg -> other.apply(this.apply(arg));
	}

	default IOByteToShort ioThen(IOShortToShort other) {
		notNull(other, "other");
		return arg -> other.apply(this.apply(arg));
	}

	default IOByteToInt ioThen(IOShortToInt other) {
		notNull(other, "other");
		return arg -> other.apply(this.apply(arg));
	}

	default IOByteToLong ioThen(IOShortToLong other) {
		notNull(other, "other");
		return arg -> other.apply(this.apply(arg));
	}

	default IOByteToFloat ioThen(IOShortToFloat other) {
		notNull(other, "other");
		return arg -> other.apply(this.apply(arg));
	}

	default IOByteToDouble ioThen(IOShortToDouble other) {
		notNull(other, "other");
		return arg -> other.apply(this.apply(arg));
	}

	default IOByteToBoolean ioThen(IOShortToBoolean other) {
		notNull(other, "other");
		return arg -> other.apply(this.apply(arg));
	}

	default <UltimateT> IOByteToObject<UltimateT> ioThen(IOShortToObject<? extends UltimateT> other) {
		notNull(other, "other");
		return arg -> other.apply(this.apply(arg));
	}

	////////

	default IOByteToByte ioThen(IOIntToByte other) {
		notNull(other, "other");
		return arg -> other.apply(this.apply(arg));
	}

	default IOByteToShort ioThen(IOIntToShort other) {
		notNull(other, "other");
		return arg -> other.apply(this.apply(arg));
	}

	default IOByteToInt ioThen(IOIntToInt other) {
		notNull(other, "other");
		return arg -> other.apply(this.apply(arg));
	}

	default IOByteToLong ioThen(IOIntToLong other) {
		notNull(other, "other");
		return arg -> other.apply(this.apply(arg));
	}

	default IOByteToFloat ioThen(IOIntToFloat other) {
		notNull(other, "other");
		return arg -> other.apply(this.apply(arg));
	}

	default IOByteToDouble ioThen(IOIntToDouble other) {
		notNull(other, "other");
		return arg -> other.apply(this.apply(arg));
	}

	default IOByteToBoolean ioThen(IOIntToBoolean other) {
		notNull(other, "other");
		return arg -> other.apply(this.apply(arg));
	}

	default <UltimateT> IOByteToObject<UltimateT> ioThen(IOIntToObject<? extends UltimateT> other) {
		notNull(other, "other");
		return arg -> other.apply(this.apply(arg));
	}

	////////

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
