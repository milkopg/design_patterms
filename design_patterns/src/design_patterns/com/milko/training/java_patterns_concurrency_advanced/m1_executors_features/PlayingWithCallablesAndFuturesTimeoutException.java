package design_patterns.com.milko.training.java_patterns_concurrency_advanced.m1_executors_features;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class PlayingWithCallablesAndFuturesTimeoutException {

	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
		Callable<String> task = () -> {
			Thread.sleep(1000);
			return "I'm thread " + Thread.currentThread().getName();
		};
		
		ExecutorService executor = Executors.newFixedThreadPool(4);
		try {
			for (int i=0; i< 10; i++) {
				Future<String> future = executor.submit(task);
				System.out.println("I get " + future.get(100, TimeUnit.MILLISECONDS));
			}
			
		} finally {
			executor.shutdown();	
		}
		
		
	}

}
