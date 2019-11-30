package design_patterns.com.milko.training.design_patterns.standard.behavioral.command.invoker;

import design_patterns.com.milko.training.design_patterns.standard.behavioral.command.api.Command;

public class Switch {
	public void execute(Command command) {
		command.execute();
	}
}
