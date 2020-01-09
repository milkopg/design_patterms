package design_patterns.com.milko.training.java_patterns_concurrency_advanced.m1_executors_features;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class SingleThreadExecutorServiceRunnableWaitingDemo {

	public static void main(String[] args) {
		Executor executor = Executors.newSingleThreadExecutor();
		Runnable task = () -> System.out.println("I run!");
		
		for (int i=0; i< 10; i++)
			executor.execute(task);
	}

}
