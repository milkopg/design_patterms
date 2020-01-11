package design_patterns.com.milko.training.java_patterns_concurrency_advanced.m2_locks_and_semaphores;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class CacheWithReadWriteLockOk {
	private Map<Long, String> cache = new HashMap<>();
	private ReadWriteLock lock = new ReentrantReadWriteLock();
	private Lock readLock = lock.readLock();
	private Lock writeLock = lock.writeLock();
	
	public String put(Long key, String value) {
		writeLock.lock();
		try {
			return cache.put(key, value);
		} finally {
			writeLock.unlock();
		}
	}
	
	public String get(Long key) {
		readLock.lock();
		try {
			return cache.get(key);
		} finally {
			readLock.unlock();
		}
		
	}
	
	public static void main(String[] args) {
		CacheWithReadWriteLockOk cache = new CacheWithReadWriteLockOk();
		
		class Producer implements Callable<String> {
			
			private Random rand = new Random();

			@Override
			public String call() throws Exception {
				while (true) {
					long key = rand.nextInt(1_000);
					cache.put(key, Long.toString(key));
					
					if (cache.get(key) == null) {
						System.out.println("Key  "  + key + " was not found in the map");
					}
				}
			}
		}
		
		ExecutorService executorService = Executors.newFixedThreadPool(4);
		
		System.out.println("Adding value...");
		
		try {
			for (int i=0; i< 4; i++) {
				executorService.submit(new Producer());
			}
		} finally {
			executorService.shutdown();
			System.out.println("Consumer shutdown");
		}
	}
}

