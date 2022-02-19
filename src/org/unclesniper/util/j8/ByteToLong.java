package org.unclesniper.util.j8;

import static org.unclesniper.util.ArgUtils.notNull;

@FunctionalInterface
public interface ByteToLong extends IOByteToLong, ThrowingByteToLong<RuntimeException> {

	@Override
	long apply(byte arg);

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
