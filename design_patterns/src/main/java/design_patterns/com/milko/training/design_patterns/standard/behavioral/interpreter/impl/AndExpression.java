package design_patterns.com.milko.training.design_patterns.standard.behavioral.interpreter.impl;

import design_patterns.com.milko.training.design_patterns.standard.behavioral.interpreter.api.Expression;

public class AndExpression implements Expression {
	
	private Expression exp1;
	private Expression exp2;
	
	public AndExpression(Expression exp1, Expression exp2) {
		this.exp1 = exp1 ;
		this.exp2 = exp2;
	}

	@Override
	public boolean interpret(String context) {
		boolean result1 =  exp1.interpret(context); 
		boolean result2 = exp2.interpret(context);
		return result1 && result2;
	}

}
