package design_patterns.com.milko.training.java_patterns_concurrency_multi_threading.m4;

public enum SingletonEnum {
	INSTANCE;

	int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public static void main(String[] args) {
		SingletonEnum singleton = SingletonEnum.INSTANCE;
		System.out.println(singleton.getValue());
		singleton.setValue(2);
		System.out.println(singleton.getValue());
	}
}
