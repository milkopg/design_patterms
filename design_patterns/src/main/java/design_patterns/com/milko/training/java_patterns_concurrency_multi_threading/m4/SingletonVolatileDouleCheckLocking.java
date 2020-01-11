package design_patterns.com.milko.training.java_patterns_concurrency_multi_threading.m4;

public class SingletonVolatileDouleCheckLocking {
	private static volatile SingletonVolatileDouleCheckLocking INSTANCE = null;
	
	private static Object lock = new Object();
	
	private SingletonVolatileDouleCheckLocking() {}
	
	public synchronized static SingletonVolatileDouleCheckLocking getInstance() {
		if (INSTANCE != null) {
			return INSTANCE;
		}
		synchronized (lock) {
			if (INSTANCE == null) {
				INSTANCE = new SingletonVolatileDouleCheckLocking();
			}
			return INSTANCE;
		}
	}
}
