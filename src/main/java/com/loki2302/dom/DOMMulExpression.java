package com.loki2302.dom;

public class DOMMulExpression extends DOMBinaryExpression {	
	public DOMMulExpression(DOMExpression leftExpression, DOMExpression rightExpression) {
		super(leftExpression, rightExpression);
	}
		
	@Override
	public <T> T accept(DOMExpressionVisitor<T> visitor) {
		return visitor.visitMulExpression(this);
	}
	
	@Override
	public String toString() {
		return String.format("(%s*%s)", getLeftExpression(), getRightExpression());
	}
}