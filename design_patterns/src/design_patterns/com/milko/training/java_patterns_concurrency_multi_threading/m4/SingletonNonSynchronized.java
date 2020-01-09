package design_patterns.com.milko.training.java_patterns_concurrency_multi_threading.m4;

public class SingletonNonSynchronized {
	private static SingletonNonSynchronized INSTANCE = null;
	
	private SingletonNonSynchronized() {}
	
	public static SingletonNonSynchronized getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new SingletonNonSynchronized();
		}
		return INSTANCE;
	}
}
