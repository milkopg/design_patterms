package design_patterns.com.milko.training.java_patterns_concurrency_multi_threading.m1;

public class FirstRunnable {

	public static void main(String[] args) {
		Runnable runnable = () -> {
			System.out.println("I'm running in " + Thread.currentThread().getName());
		};
		
		Thread t = new Thread(runnable);
		t.setName("My thread");
		t.start();
	}

}
