package design_patterns.com.milko.training.java_patterns_concurrency_multi_threading.m4;

public class SingletonSynchronized {
	private static SingletonSynchronized INSTANCE = null;
	
	private SingletonSynchronized() {}
	
	public static synchronized SingletonSynchronized getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new SingletonSynchronized();
		}
		return INSTANCE;
	}
}
