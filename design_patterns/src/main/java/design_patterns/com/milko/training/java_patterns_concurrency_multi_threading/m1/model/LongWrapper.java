package design_patterns.com.milko.training.java_patterns_concurrency_multi_threading.m1.model;

public class LongWrapper {
	private final Object key = new Object();
	
	private long l;
	
	public LongWrapper(long l) {
		this.l = l;
	}
	
	public long getValue() {
		return l;
	}
	
	public void incrementValue() {
		synchronized (key) { //uncomment it for race conditions
			l = l + 1;
		}
	}
}
