package design_patterns.com.milko.training.java_patterns_concurrency_advanced.m3_barriers_and_latches;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class BarrierNokDemoFutureGetTimeoutException {

	public static void main(String[] args) {
		class Friend implements Callable<String> {

			private CyclicBarrier barrier;

			public Friend(CyclicBarrier barrier) {
				this.barrier = barrier;
			}

			@Override
			public String call() throws Exception {
				try {
					Random random = new Random();
					Thread.sleep(random.nextInt(20) * 100 + 100);
					System.out.println("I've just arrived, waiting for others");

					barrier.await();

					System.out.println("Let's go to the cinema");

					return "ok";
				} catch (InterruptedException e) {
					// TODO: handle exception
					System.out.println("Interrupted exceotion");
				}
				return "nok";
			}
		}
		
		//Thread should be == Barier count
		ExecutorService executorService = Executors.newFixedThreadPool(4);
		
		CyclicBarrier barrier = new CyclicBarrier(4, ()-> System.out.println("barier openning"));
		
		List<Future<String>> futures = new ArrayList<>();
		
		try {
			for (int i=0; i < 4; i++) {
				Friend friend = new Friend(barrier);
				futures.add(executorService.submit(friend));
			}
			
			futures.forEach(
					future -> {
						try {
							future.get(200, TimeUnit.MILLISECONDS);			
						} catch (InterruptedException | ExecutionException e) {
							System.out.println(e.getMessage());
						} catch (Exception e) {
							System.out.println("Timed out");
							//cancel future tasks throws Interrupted exception
							future.cancel(true);
					
						}
					}
				);
		} finally {
			executorService.shutdown();
		}
		
	
	}
}
