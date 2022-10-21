package org.unclesniper.util;

/* Sooooo... As I see it, only an operation can experience and arithmetic overflow.
 * Going by that, there are essentially two sources of numbers: Internal to the
 * unit (which I guess translates to "class", since an enum is basically a somewhat
 * restricted class (and the (sort-of-)reflection API agrees, cf. the JavaDoc of
 * java.lang.Class) and an interface can only provide "real" operations (in the sense
 * of having an implemenation, i.e. body) as being static (in which case the unit
 * simply is effectively void) or as defaults (in which case the operation does not
 * exist in the interface, only in the classes implementing the interface but not
 * the method)), i.e. fields, or external to the unit, i.e. parameters (including
 * module static ones, such as static variables/constants -- and yes, those are
 * effectively parameters -- do learn you a Haskell for great good). Since your
 * garden variety arithmetic operator is binary, this yields four possible
 * combinations -- if you don't immediately understand this, stop reading now.
 * Since the state-of-the-object is considered a given (in the "precondition" sense),
 * throwing an exception when both sources are internal is nonsense, as the
 * object should not have been allowed to enter that state in the first place
 * (and even though this is not always necessarily true, the consequences of this
 * face are left as an excercise to the reader -- ha ha, just kidding, as if I could
 * trust you to understand; if you have an operation that should not be invoked
 * if this would cause an overflow, define your own exception type, huh?).
 * As such -- and because internal sources are generally (as in "in the general case,
 * i.e. special cases might deviate) not considered at fault -- we consider that
 * "one of the" (possibly "the only") external source is at fault. Consequently,
 * an arithmetic overflow is considered to be caused by a "bad" argument.
 * Thus, this class extends IllegalArgumentException.
 */
public class ArithmeticPrecisionExceededException extends IllegalArgumentException {

	public ArithmeticPrecisionExceededException(String message) {
		super(message);
	}

}
