package design_patterns.com.milko.training.java8_functional.m_5_stream;

import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

import design_patterns.com.milko.training.java8_functional.m_1_lambda_expressions.Person;
import design_patterns.com.milko.training.java8_functional.m_1_lambda_expressions.PersonListCreator;

public class StreamFilterDemo {

	public static void main(String[] args) throws IOException {
		List<Person> people = PersonListCreator.getGalevList();
		people.stream()						//Stream<Person>
			//	.map(p-> p.getAge())		//Stream<Integer>
				.filter(p -> p.getAge() > 20)	//Stream<Integer>
				.forEach(System.out::println);
		
		people.stream()						//Stream<Person>
			.map(p-> p.getAge())		//Stream<Integer>
			.peek(System.out::println)
			.filter(age -> age > 20)	//Stream<Integer>
			.forEach(System.out::println);
		
		//peek at the end instead of foreach
		//print none
		people.stream()					
		.map(p-> p.getAge())		
		.peek(System.out::println)
		.filter(age -> age > 20)	
		.peek(System.out::println);
		
		//skip and limit method
		System.out.println("Skip and Limit method");
		people.stream()
			.skip(2)
			.limit(3)
			.filter(p -> p.getAge() > 4)
			.forEach(System.out::println);
		
		//empty strea,
		Stream.empty();
		
		//a singletonStream
		Stream.of("one");
		
		
		//stream with elements
		Stream.of("one", "two", "three");
		
		//Stream from text file
	//	Stream<String> streamFile = Files.lines(null);
		
		//Stream via StreamBuilder
		Stream.Builder<String> builder = Stream.builder();
		builder.add("add").add("two").add("three");
		builder.accept("four");
		Stream<String> viaBuilder = builder.build();
		
	}

}
