package design_patterns.com.milko.training.java8_functional.m_3_data_processing_on_collection.pluralsight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapAPICollectionMapDemo {

	public static void main(String[] args) {
		Person p1 = new Person("Alice", 23);
		Person p2 = new Person("Brian", 56);
		Person p3 = new Person("Chelsea", 46);
		Person p4 = new Person("David", 28);
		Person p5 = new Person("Erica", 37);
		Person p6 = new Person("Francisco", 18);

		List<Person> peopleList = new ArrayList<>(Arrays.asList(p1, p2, p3, p4, p5, p6));
		peopleList.forEach(person -> System.out.println(person));

		System.out.println("\n");

		peopleList.forEach(System.out::println);

		// removeIf
		peopleList.removeIf(person -> person.getAge() < 30);
		System.out.println("removeIf age< 30" + peopleList);

		// replaceAll
		peopleList.replaceAll(person -> new Person(person.getName().toUpperCase(), person.getAge()));
		;
		System.out.println("replaceAll to upperCase: " + peopleList);

		peopleList.sort(Comparator.comparing(Person::getAge).reversed());
		System.out.println("sort by age: " + peopleList);

		City newYork = new City("New York");
		City shanghai = new City("Shanghai");
		City paris = new City("Paris");

		Map<City, List<Person>> map1 = new HashMap<>();
		System.out.println("People from Paris: " + map1.getOrDefault(paris, Collections.EMPTY_LIST));

		map1.putIfAbsent(paris, new ArrayList<Person>());
		map1.get(paris).add(p1);
		map1.computeIfAbsent(newYork, city -> new ArrayList<>()).add(p1);
		map1.computeIfAbsent(shanghai, city -> new ArrayList<>()).add(p2);
		map1.computeIfAbsent(shanghai, city -> new ArrayList<>()).add(p3);

		System.out.println("map1: " + map1);

		Map<City, List<Person>> map2 = new HashMap<>();
		map2.computeIfAbsent(shanghai, city -> new ArrayList<>()).add(p4);
		map2.computeIfAbsent(paris, city -> new ArrayList<>()).add(p5);
		map2.computeIfAbsent(paris, city -> new ArrayList<>()).add(p6);

		System.out.println("Map 2");
		map2.forEach((city, people) -> System.out.println(city + " : " + people));

		map2.forEach((city, people) -> map1.merge(city, people, (peopleFromMap1, peopleFromMap2) 
				-> {
					peopleFromMap1.addAll(peopleFromMap2);
					return peopleFromMap1;
				}));
		
		System.out.println("Merged map1 ");
		map1.forEach((city, people) -> System.out.println("city: " + city  + ": " + people));
	}

}
