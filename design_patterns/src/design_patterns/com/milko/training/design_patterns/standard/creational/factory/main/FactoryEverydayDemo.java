package design_patterns.com.milko.training.design_patterns.standard.creational.factory.main;

import java.util.Calendar;

public class FactoryEverydayDemo {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();

		System.out.println(cal);
		
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
	}

}
