package design_patterns.com.milko.training.design_patterns.standard.behavioral.mediator.main;

import java.awt.Toolkit;
import java.util.Timer;
import java.util.TimerTask;

public class MediatorEverydayDemo {
	
	private Timer timer;
	
	private Toolkit toolkit;

	public MediatorEverydayDemo(int seconds) {
		toolkit = Toolkit.getDefaultToolkit();
		timer = new Timer();
		timer.schedule(new RewindTask(), seconds* 1000);
		timer.schedule(new RewindTaskWithoutBeep(), seconds * 2 * 1009);
	}
	
	public static void main(String[] args) {
		System.out.println("About to schedule task.");
		new MediatorEverydayDemo (3); 
		System.out.println("Task scheduled.");
	}

	class RewindTask extends TimerTask {

		@Override
		public void run() {
			System.out.println("Time's up");
			toolkit.beep();
		}
		
	}
	
	class RewindTaskWithoutBeep extends TimerTask {

		@Override
		public void run() {
			System.out.println("Now Time's really up!");
			timer.cancel();
		}
	}
	
}

