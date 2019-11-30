package design_patterns.com.milko.training.design_patterns.standard.behavioral.interpreter.main;

import design_patterns.com.milko.training.design_patterns.standard.behavioral.interpreter.api.Expression;
import design_patterns.com.milko.training.design_patterns.standard.behavioral.interpreter.impl.AndExpression;
import design_patterns.com.milko.training.design_patterns.standard.behavioral.interpreter.impl.OrExpression;
import design_patterns.com.milko.training.design_patterns.standard.behavioral.interpreter.impl.TerminalExpression;

public class InterpreterDemo {

	static Expression buildInterpreterTreee() {
		Expression termimal1 = new TerminalExpression("Lions");
		Expression terminal2 = new TerminalExpression("Tigers");
		Expression terminal3 = new TerminalExpression("Bears");
		
		//Tigers and Bears
		Expression alternation1 = new AndExpression(terminal2, terminal3);
	
		//Lions or (Tigers and Bears)
		Expression alternation2 = new OrExpression(termimal1, alternation1);
		
		//Bears and (Lions or (Tigers and Bears))
		return new AndExpression(terminal3, alternation2);
	}
	
	public static void main(String[] args) {
		
		//String context = "Lions"; //false
		//String context = "Tigers"; //false
		//String context = "Bears"; //false
		//String context = "Lions Tigers"; //false
		//String context = "Lions Bears"; //true
		String context = "Tigers Bears"; // true
		
		
		Expression define = buildInterpreterTreee();
		
		System.out.println(context + " is " + define.interpret(context));
	}

}
