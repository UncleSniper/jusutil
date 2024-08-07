package org.unclesniper.util;

public enum RangeOrdering {

	/* Here, it gets somewhat tricky. In principle, we have two ranges,
	 * with two bounds each, and each of those 2 * 2 = 4 combinations
	 * can have any relation (less, equal, greater). However, choosing
	 * any value for any of those columns can rule out values for other
	 * columns. We render the combinations as:
	 *   - a lower vs b lower
	 *   - a lower vs b upper
	 *   - a upper vs b lower
	 *   - a upper vs b upper
	 * Thus:
	 *   LLLL: |---|
	 *               |---|
	 *   LLEL: |---|
	 *             |---|
	 *   LLGL: |---|
	 *            |---|
	 *   LLGE: |----|
	 *          |---|
	 *   ELLE: |---|
	 *         |---|
	 *   LLGG: |-----|
	 *          |---|
	 *   ELGG: |----|
	 *         |---|
	 *   GLGG:    |---|
	 *         |---|
	 *   GEGG:     |---|
	 *         |---|
	 *   GGGG:       |---|
	 *         |---|
	 *   ELGL: |---|
	 *         |----|
	 *   GLGE:  |---|
	 *         |----|
	 * Cute, except we left out zero-size ranges. Thus:
	 *   LLLL: |
	 *           |---|
	 *   ELEL: |
	 *         |---|
	 *   GLGL:   |
	 *         |---|
	 *   GEGE:     |
	 *         |---|
	 *   GGGG:       |
	 *         |---|
	 * And the other way around:
	 *   LLLL: |---|
	 *               |
	 *   LLEE: |---|
	 *             |
	 *   LLGG: |---|
	 *           |
	 *   EEGG: |---|
	 *         |
	 *   GGGG:   |---|
	 *         |
	 * And both:
	 *   EEEE: |
	 *         |
	 * Missing:
	 *   LLLE, LLLG, LLEG, LELL, LELE, LELG, LEEL, LEEE, LEEG, LEGL, LEGE, LEGG, LGLL, LGLE, LGLG, LGEL,
	 *         LGEE, LGEG, LGGL, LGGE, LGGG: if a upper < b lower, then a < b => LLLL [L[^EG][^EG][^EG]]
	 *   ELLL, ELLG, EELL, EELE, EELG, EGLL, EGLE, EGLG: if a lower = b lower, then a upper >= b lower
	 *                                 => ELLE || ELGG || ELEL || EEGG || EEEE [E.[^L].]
	 *   ELEG, EEEG, EGEE, EGEL, EGEG: if a lower = b lower && a upper = b lower,
	 *                                 then a lower = a upper -> a upper/lower <= b upper
	 *         => ELEL || EEEE [E[^G]E[^G]]
	 *   ELEE, ELGE, EGGE, EEGE: if a lower = b lower && a upper = b upper, then a = b => ELLE || EEEE [E[^G][^G]E]
	 *   EEEL: if a lower = b lower && a lower = b upper && a upper = b lower, then a upper = b upper
	 *         => EEEE [EEE[^LG]]
	 *   EEGL: if a lower = b lower && a lower = b upper, then b lower = b upper -> a upper >= b lower/upper
	 *         => EEGG || EEEE [EE[^L][^L]
	 *   EGGL, EGGG: if a lower = b lower && a lower > b upper, then b lower > b upper, then false [EG[^LEG][^LEG]]
	 *   GLLL, GLLE, GLLG, GELL, GELE, GELG: if a lower > b lower && a upper < b lower, then false [G[^LEG]L[^LEG]]
	 *   GLEL, GLEE, GLEG, GEEL, GEEE, GEEG: if a lower > b lower && a upper = b lower, then a lower > a upper
	 *                                       => false [G[^LEG]E[^LEG]]
	 *   GEGL: if a lower = b upper, then a upper >= b upper => false [.E.[^L]]
	 *   GGLL, GGLE, GGLG, GGEL, GGEE, GGEG, GGGL, GGGE: if a lower > b upper, then a > b => GGGG [[^LE]G[^LE][^LE]
	 */

	LLLL(
		RangeOrderingFlags.FL_LL_L |
		RangeOrderingFlags.FL_LU_L |
		RangeOrderingFlags.FL_UL_L |
		RangeOrderingFlags.FL_UU_L
	),
	LLEL(
		RangeOrderingFlags.FL_LL_L |
		RangeOrderingFlags.FL_LU_L |
		RangeOrderingFlags.FL_UL_E |
		RangeOrderingFlags.FL_UU_L
	),
	LLGL(
		RangeOrderingFlags.FL_LL_L |
		RangeOrderingFlags.FL_LU_L |
		RangeOrderingFlags.FL_UL_G |
		RangeOrderingFlags.FL_UU_L
	),
	LLGE(
		RangeOrderingFlags.FL_LL_L |
		RangeOrderingFlags.FL_LU_L |
		RangeOrderingFlags.FL_UL_G |
		RangeOrderingFlags.FL_UU_E
	),
	ELLE(
		RangeOrderingFlags.FL_LL_E |
		RangeOrderingFlags.FL_LU_L |
		RangeOrderingFlags.FL_UL_L |
		RangeOrderingFlags.FL_UU_E
	),
	LLGG(
		RangeOrderingFlags.FL_LL_L |
		RangeOrderingFlags.FL_LU_L |
		RangeOrderingFlags.FL_UL_G |
		RangeOrderingFlags.FL_UU_G
	),
	ELGG(
		RangeOrderingFlags.FL_LL_E |
		RangeOrderingFlags.FL_LU_L |
		RangeOrderingFlags.FL_UL_G |
		RangeOrderingFlags.FL_UU_G
	),
	GLGG(
		RangeOrderingFlags.FL_LL_G |
		RangeOrderingFlags.FL_LU_L |
		RangeOrderingFlags.FL_UL_G |
		RangeOrderingFlags.FL_UU_G
	),
	GEGG(
		RangeOrderingFlags.FL_LL_G |
		RangeOrderingFlags.FL_LU_E |
		RangeOrderingFlags.FL_UL_G |
		RangeOrderingFlags.FL_UU_G
	),
	GGGG(
		RangeOrderingFlags.FL_LL_G |
		RangeOrderingFlags.FL_LU_G |
		RangeOrderingFlags.FL_UL_G |
		RangeOrderingFlags.FL_UU_G
	),
	ELGL(
		RangeOrderingFlags.FL_LL_E |
		RangeOrderingFlags.FL_LU_L |
		RangeOrderingFlags.FL_UL_G |
		RangeOrderingFlags.FL_UU_L
	),
	GLGE(
		RangeOrderingFlags.FL_LL_G |
		RangeOrderingFlags.FL_LU_L |
		RangeOrderingFlags.FL_UL_G |
		RangeOrderingFlags.FL_UU_E
	),
	ELEL(
		RangeOrderingFlags.FL_LL_E |
		RangeOrderingFlags.FL_LU_L |
		RangeOrderingFlags.FL_UL_E |
		RangeOrderingFlags.FL_UU_L
	),
	GLGL(
		RangeOrderingFlags.FL_LL_G |
		RangeOrderingFlags.FL_LU_L |
		RangeOrderingFlags.FL_UL_G |
		RangeOrderingFlags.FL_UU_L
	),
	GEGE(
		RangeOrderingFlags.FL_LL_G |
		RangeOrderingFlags.FL_LU_E |
		RangeOrderingFlags.FL_UL_G |
		RangeOrderingFlags.FL_UU_E
	),
	LLEE(
		RangeOrderingFlags.FL_LL_L |
		RangeOrderingFlags.FL_LU_L |
		RangeOrderingFlags.FL_UL_E |
		RangeOrderingFlags.FL_UU_E
	),
	EEGG(
		RangeOrderingFlags.FL_LL_E |
		RangeOrderingFlags.FL_LU_E |
		RangeOrderingFlags.FL_UL_G |
		RangeOrderingFlags.FL_UU_G
	),
	EEEE(
		RangeOrderingFlags.FL_LL_E |
		RangeOrderingFlags.FL_LU_E |
		RangeOrderingFlags.FL_UL_E |
		RangeOrderingFlags.FL_UU_E
	);

	private final int flags;

	private RangeOrdering(int flags) {
		this.flags = flags;
	}

	public int getFlags() {
		return flags;
	}

	public boolean hasAny(int mask) {
		return (flags & mask) != 0;
	}

	public boolean hasAll(int mask) {
		return (flags & mask) == mask;
	}

	public boolean hasAnyAndNone(int any, int none) {
		return (flags & any) != 0 && (flags & none) == 0;
	}

	public boolean hasAllAndNone(int all, int none) {
		return (flags & all) == all && (flags & none) == 0;
	}

}
