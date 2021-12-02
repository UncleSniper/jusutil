package org.unclesniper.util.j8;

import org.unclesniper.util.OrderRelation;
import org.unclesniper.util.OMGWereDoomedError;

public class DoubleBound implements DoubleP {

	private double threshold;

	private OrderRelation relation;

	public DoubleBound(double threshold, OrderRelation relation) {
		this.threshold = threshold;
		this.relation = relation;
	}

	public double getThreshold() {
		return threshold;
	}

	public void setThreshold(double threshold) {
		this.threshold = threshold;
	}

	public OrderRelation getRelation() {
		return relation;
	}

	public void setRelation(OrderRelation relation) {
		this.relation = relation;
	}

	@Override
	public boolean testDouble(double value) {
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
