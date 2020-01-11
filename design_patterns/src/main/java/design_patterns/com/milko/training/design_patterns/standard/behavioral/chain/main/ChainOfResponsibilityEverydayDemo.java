package design_patterns.com.milko.training.design_patterns.standard.behavioral.chain.main;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChainOfResponsibilityEverydayDemo {
	
	private static final Logger logger = Logger.getLogger(ChainOfResponsibilityEverydayDemo.class.getName());

	public static void main(String[] args) {
		//level info at
		logger.setLevel(Level.FINER);
		
		//level to publish at
		ConsoleHandler consoleHandler = new ConsoleHandler();
		consoleHandler.setLevel(Level.FINER);
		logger.addHandler(consoleHandler);

		logger.finest("Finest level of logging"); //this one won't print
		logger.finer("Finer level, but not as fine as finest");
		logger.fine("Fine, but not as fine as finer or finest");
	}

}
