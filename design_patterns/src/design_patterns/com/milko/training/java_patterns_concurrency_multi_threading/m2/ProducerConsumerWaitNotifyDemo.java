package design_patterns.com.milko.training.java_patterns_concurrency_multi_threading.m2;

public class ProducerConsumerWaitNotifyDemo {

	private static Object lock = new Object();

	private static int[] buffer;
	private static int count;

	static class Producer {
		void produce()  {
			synchronized (lock) {
				if (isFull(buffer)) {
					try {
						lock.wait(); // wait until consume thread consume buffer
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				buffer[count++] = 1;
				lock.notify(); // release locked thread 
			}

		}
	}

	static class Consumer {
		void consume()  {
			synchronized (lock) {
				while (isEmpty(buffer)) {
					try {
						lock.wait(); // wait until producer thread produce buffer
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				buffer[--count] = 0;
				lock.notify(); // release locked thread
			}
		}
	}

	static boolean isFull(int[] buffer) {
		return count == buffer.length;
	}

	static boolean isEmpty(int[] buffer) {
		return count == 0;
	}

	public static void main(String[] args) throws InterruptedException {
		buffer = new int[10];
		count = 0;

		Producer producer = new Producer();
		Consumer consumer = new Consumer();

		Runnable productTask = () -> {
			for (int i = 0; i < 50; i++) {
				producer.produce();
			}
			System.out.println("Done producing");
		};

		Runnable consumeTask = () -> {
			for (int i = 0; i < 45; i++) { // modify it to 50 to be consumed 100%
				consumer.consume();
			}
			System.out.println("Done consuming");
		};

		Thread consumerThread = new Thread(consumeTask);
		Thread producerThread = new Thread(productTask);

		consumerThread.start();
		producerThread.start();

		consumerThread.join();
		producerThread.join();

		System.out.println("Data in the buffer " + count);
	}

}
