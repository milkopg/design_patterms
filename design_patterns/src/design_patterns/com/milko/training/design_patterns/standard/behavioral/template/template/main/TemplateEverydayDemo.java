package design_patterns.com.milko.training.design_patterns.standard.behavioral.template.template.main;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TemplateEverydayDemo {
	
	private static void printContents(List<Person> people) {
		for (Person person : people) {
			System.out.println(person.getName() + " " + person.getAge());
		}
	}

	public static void main(String[] args) {
		Person bryan = new Person("Bryan", "801-555-1212", 39);
		Person mark = new Person("Mark", "801-444-1234", 41);
		Person chris = new Person("Chris", "801-222-5151", 38);
		
		List<Person> people = Arrays.asList(bryan, mark, chris);
		System.out.println("Not sorted: ");
		printContents(people);
		
		System.out.println();
		System.out.println("Sorted:");
		Collections.sort(people);
		printContents(people);
	}

}
