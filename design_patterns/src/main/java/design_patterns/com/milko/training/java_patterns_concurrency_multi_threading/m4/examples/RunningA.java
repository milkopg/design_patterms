package design_patterns.com.milko.training.java_patterns_concurrency_multi_threading.m4.examples;

import design_patterns.com.milko.training.java_patterns_concurrency_multi_threading.m4.examples.model.A;

public class RunningA {

	public static void main(String[] args) throws InterruptedException {

		A a = new A();
		
		Runnable r1 = () -> a.a();
		Runnable r2 = () -> a.b();
		
		Thread t1 = new Thread(r1);
		t1.start();

		Thread t2 = new Thread(r2);
		t2.start();

		t1.join();
		t2.join();
	}
}
