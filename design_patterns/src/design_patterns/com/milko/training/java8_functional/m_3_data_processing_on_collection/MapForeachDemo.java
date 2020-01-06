package design_patterns.com.milko.training.java8_functional.m_3_data_processing_on_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;

import design_patterns.com.milko.training.java8_functional.m_1_lambda_expressions.Person;
import design_patterns.com.milko.training.java8_functional.m_1_lambda_expressions.PersonListCreator;

public class MapForeachDemo {

	public static void main(String[] args) {
		List<Person> galevFamily = PersonListCreator.getGalevList();
		List<Person> vasilevFamily = PersonListCreator.getVasileviList();

		Map<String, List<Person>> map = new HashMap<String, List<Person>>();
		map.put("galevi", galevFamily);

		map.forEach((familyName, people) -> System.out.println("familyName: " + familyName + " , people: " + people));

		// getOrDefault
		System.out.println(map.getOrDefault("vasilevi", Collections.emptyList()));

		// putIfAbsend - it will not override current key it is already assigned
		System.out.println("putIfAbsent: " + map.putIfAbsent("galevi", Collections.emptyList()));
		map.get("galevi").add(new Person("Petar", "Galev", 66));
		System.out.println(map);

		// replace()
		map.put("vasilevi", Collections.emptyList());
		map.replace("vasilevi", galevFamily);
		System.out.println("map.replace(): " + map);

		// replace(key, existingKey, newValue)
		map.replace("vasilevi", galevFamily, Collections.emptyList());
		System.out.println(map);

		map = new HashMap<String, List<Person>>();
		map.put("galevi", PersonListCreator.getGalevList());
		map.replaceAll((key, oldValue) -> vasilevFamily);
		System.out.println("\nreplaceAll BiFunction: " + map);

		// new remove method, remove only key-> Value pair is valid
		// this will not remove record
		map.remove("galevi", galevFamily);
		System.out.println("remove nok: " + map);

		// remove ok
		map.remove("galevi", vasilevFamily);
		System.out.println("remove ok" + map);

		// compute method
		map.clear();
		map.put("galevi", galevFamily);
		map.put("vasilevi", vasilevFamily);
		map.compute("galevi", (key, value) -> new ArrayList<>());
		map.compute("vasilevi", (key, value) -> galevFamily);
		System.out.println("map compute:" + map);

		// computIfAbsent
		map.clear();
		map.computeIfAbsent("georgievi", (value) -> galevFamily);
		System.out.println("map computeIfAbsend:" + map);

		// computIfPresent
		map.clear();
		map.computeIfPresent("georgievi", (key, value) -> galevFamily);
		System.out.println("map computeIfPresent:" + map);

		// computeIfPresent
		Map<String, Map<String, Person>> doubleMap = new HashMap<String, Map<String, Person>>();
		doubleMap.computeIfAbsent("one", key -> new HashMap<String, Person>()).put("two",
				new Person("Milko", "Galev", 37));
		System.out.println("doubleMap : " + doubleMap);

		// computIfPresent
		Map<String, List<Person>> mapOfList = new HashMap<String, List<Person>>();
		mapOfList.computeIfAbsent("one", key -> new ArrayList<Person>()).add(new Person("Milko", "Galev", 37));
		System.out.println("mapOfList: " + mapOfList);

		// merge
		Map<String, List<Person>> map1 = new HashMap<String, List<Person>>();
		Map<String, List<Person>> map2 = new HashMap<String, List<Person>>();

		map1.put("vasilevi", galevFamily);
		map2.put("vasilevi", vasilevFamily);

		map2.forEach((key, value) -> map1.merge(key, value, 
				(existingPeople, newPeople) -> {
					existingPeople.addAll(newPeople);
			return existingPeople;
		}));
		System.out.println("merge: "+ map1);
		
	}
}
