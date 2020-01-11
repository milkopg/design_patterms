package design_patterns.com.milko.training.design_patterns.standard.behavioral.interpreter.impl;

import java.util.StringTokenizer;

import design_patterns.com.milko.training.design_patterns.standard.behavioral.interpreter.api.Expression;

public class TerminalExpression implements Expression {

	private String data;
	
	public TerminalExpression(String data) {
		this.data = data;
	}
	
	@Override
	public boolean interpret(String context) {
		StringTokenizer tokenizer = new StringTokenizer(context);
		while(tokenizer.hasMoreTokens()) {
			String test = tokenizer.nextToken();
			if (test.equals(data))  {
				return true;
			}
		}
		return false;
	}
}
