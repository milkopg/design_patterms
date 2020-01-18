package design_patterns.com.milko.training.design_patterns.standard.behavioral.template.template.model;

public class Person implements Comparable<Person>{
	private String name;
	private String phoneNumber;
	private int age;
	
	public Person(String name, String phoneNumber, int age) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Person o) {
		if (this.age > o.getAge()) {
			return 1;
		} 
		if (this.age < o.age) {
			return -1;
		}
		return 0;
	}
	
	
}
