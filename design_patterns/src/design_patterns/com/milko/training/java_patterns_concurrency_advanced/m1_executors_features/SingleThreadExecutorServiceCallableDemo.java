package design_patterns.com.milko.training.java_patterns_concurrency_advanced.m1_executors_features;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SingleThreadExecutorServiceCallableDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		//Executor executor = Executors.newSingleThreadExecutor();
		
		ExecutorService executor = Executors.newFixedThreadPool(4);
		
		Callable<String> task = () -> buildingPatientReport();
		
		Future<String> future = executor.submit(task);
		System.out.println(future.get());
		

	}

	private static String buildingPatientReport() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Done";
	}

	
}
