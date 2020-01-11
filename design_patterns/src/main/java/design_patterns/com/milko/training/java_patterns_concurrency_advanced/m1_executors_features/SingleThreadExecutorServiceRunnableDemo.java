package design_patterns.com.milko.training.java_patterns_concurrency_advanced.m1_executors_features;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class SingleThreadExecutorServiceRunnableDemo {

	public static void main(String[] args) {
		Executor executor = Executors.newSingleThreadExecutor();
		Runnable task1 = () -> System.out.println("First task");
		Runnable task2 = () -> {
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Second task");
			};
		
		
			executor.execute(task1);
			
			System.out.println("Between first and second task, executed first");
			
			executor.execute(task2);
			
			System.out.println("Done");
	}
}
