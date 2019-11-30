package design_patterns.com.milko.training.design_patterns.standard.behavioral.memento.state;

import java.util.Stack;

import design_patterns.com.milko.training.design_patterns.standard.behavioral.memento.memento.EmployeeMemento;
import design_patterns.com.milko.training.design_patterns.standard.behavioral.memento.originator.Employee;

public class CareTaker {
	private Stack<EmployeeMemento> historyStack = new Stack<>();
	
	public void save(Employee emp) {
		historyStack.push(emp.save());
	}
	
	public void revert(Employee emp) {
		emp.revert(historyStack.pop());
	}
}
