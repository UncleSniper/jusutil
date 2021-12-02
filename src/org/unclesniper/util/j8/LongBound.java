package org.unclesniper.util.j8;

import org.unclesniper.util.OrderRelation;
import org.unclesniper.util.OMGWereDoomedError;

public class LongBound implements LongP {

	private long threshold;

	private OrderRelation relation;

	public LongBound(long threshold, OrderRelation relation) {
		this.threshold = threshold;
		this.relation = relation;
	}

	public long getThreshold() {
		return threshold;
	}

	public void setThreshold(long threshold) {
		this.threshold = threshold;
	}

	public OrderRelation getRelation() {
		return relation;
	}

	public void setRelation(OrderRelation relation) {
		this.relation = relation;
	}

	@Override
	public boolean testLong(long value) {
		switch(relation) {
			case LT:
				return value < threshold;
			case LE:
				return value <= threshold;
			case EQ:
				return value == threshold;
			case GE:
				return value >= threshold;
			case GT:
				return value > threshold;
			default:
				throw new OMGWereDoomedError("Unrecognized order relation: " + relation.name());
		}
	}

}
