package design_patterns.com.milko.training.java_patterns_concurrency_multi_threading.m4;

public class SingletonDouleCheckLocking {
	private static SingletonDouleCheckLocking INSTANCE = null;
	
	private static Object lock = new Object();
	
	private SingletonDouleCheckLocking() {}
	
	public synchronized static SingletonDouleCheckLocking getInstance() {
		if (INSTANCE != null) {
			return INSTANCE;
		}
		synchronized (lock) {
			if (INSTANCE == null) {
				INSTANCE = new SingletonDouleCheckLocking();
			}
			return INSTANCE;
		}
	}
}
