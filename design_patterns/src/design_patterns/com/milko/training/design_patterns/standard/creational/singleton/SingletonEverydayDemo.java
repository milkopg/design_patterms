package design_patterns.com.milko.training.design_patterns.standard.creational.singleton;

public class SingletonEverydayDemo {

	public static void main(String[] args) {
		Runtime sinletonRuntime = Runtime.getRuntime();
		sinletonRuntime.gc();
		
		System.out.println(sinletonRuntime);
		
		Runtime anotherInstance = Runtime.getRuntime();
		System.out.println(anotherInstance); 
		
		if (sinletonRuntime == anotherInstance) {
			System.out.println("They are same instance");
		}
	}

}
