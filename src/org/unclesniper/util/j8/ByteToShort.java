package org.unclesniper.util.j8;

import static org.unclesniper.util.ArgUtils.notNull;

@FunctionalInterface
public interface ByteToShort extends IOByteToShort {

	@Override
	short apply(byte arg);

	default ByteToByte then(ShortToByte other) {
		notNull(other, "other");
		return arg -> other.apply(this.apply(arg));
	}

	default ByteToShort then(ShortToShort other) {
		notNull(other, "other");
		return arg -> other.apply(this.apply(arg));
	}

	default ByteToInt then(ShortToInt other) {
		notNull(other, "other");
		return arg -> other.apply(this.apply(arg));
	}

	default ByteToLong then(ShortToLong other) {
		notNull(other, "other");
		return arg -> other.apply(this.apply(arg));
	}

	default ByteToFloat then(ShortToFloat other) {
		notNull(other, "other");
		return arg -> other.apply(this.apply(arg));
	}

	default ByteToDouble then(ShortToDouble other) {
		notNull(other, "other");
		return arg -> other.apply(this.apply(arg));
	}

	default ByteToBoolean then(ShortToBoolean other) {
		notNull(other, "other");
		return arg -> other.apply(this.apply(arg));
	}

	default <UltimateT> ByteToObject<UltimateT> then(ShortToObject<? extends UltimateT> other) {
		notNull(other, "other");
		return arg -> other.apply(this.apply(arg));
	}

	////////

	default ByteToByte then(IntToByte other) {
		notNull(other, "other");
		return arg -> other.apply(this.apply(arg));
	}

	default ByteToShort then(IntToShort other) {
		notNull(other, "other");
		return arg -> other.apply(this.apply(arg));
	}

	default ByteToInt then(IntToInt other) {
		notNull(other, "other");
		return arg -> other.apply(this.apply(arg));
	}

	default ByteToLong then(IntToLong other) {
		notNull(other, "other");
		return arg -> other.apply(this.apply(arg));
	}

	default ByteToFloat then(IntToFloat other) {
		notNull(other, "other");
		return arg -> other.apply(this.apply(arg));
	}

	default ByteToDouble then(IntToDouble other) {
		notNull(other, "other");
		return arg -> other.apply(this.apply(arg));
	}

	default ByteToBoolean then(IntToBoolean other) {
		notNull(other, "other");
		return arg -> other.apply(this.apply(arg));
	}

	default <UltimateT> ByteToObject<UltimateT> then(IntToObject<? extends UltimateT> other) {
		notNull(other, "other");
		return arg -> other.apply(this.apply(arg));
	}

	////////

	default ByteToByte then(LongToByte other) {
		notNull(other, "other");
		return arg -> other.apply(this.apply(arg));
	}

	default ByteToShort then(LongToShort other) {
		notNull(other, "other");
		return arg -> other.apply(this.apply(arg));
	}

	default ByteToInt then(LongToInt other) {
		notNull(other, "other");
		return arg -> other.apply(this.apply(arg));
	}

	default ByteToLong then(LongToLong other) {
		notNull(other, "other");
		return arg -> other.apply(this.apply(arg));
	}

	default ByteToFloat then(LongToFloat other) {
		notNull(other, "other");
		return arg -> other.apply(this.apply(arg));
	}

	default ByteToDouble then(LongToDouble other) {
		notNull(other, "other");
		return arg -> other.apply(this.apply(arg));
	}

	default ByteToBoolean then(LongToBoolean other) {
		notNull(other, "other");
		return arg -> other.apply(this.apply(arg));
	}

	default <UltimateT> ByteToObject<UltimateT> then(LongToObject<? extends UltimateT> other) {
		notNull(other, "other");
		return arg -> other.apply(this.apply(arg));
	}

}
