package design_patterns.com.milko.training.java8_functional.m_5_stream;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamBuildingDemo {

	public static void main(String[] args) {
		List<Integer> ints = Arrays.asList(0, 1, 2, 3, 4);

		Stream<Integer> stream1 = ints.stream();
		Stream<Integer> stream = Stream.of(0, 1, 2, 3, 4);
		stream.forEach(System.out::println);
		
		Stream<String> streamOfStrings = Stream.generate(() -> "one");
		streamOfStrings.limit(5).forEach(System.out::println);
		
		Stream<String> streamOfString2 = Stream.iterate("+", s-> s+ "+");
		streamOfString2.limit(5).forEach(System.out::println);
		
		IntStream streamOfInt = ThreadLocalRandom.current().ints();
		streamOfInt.limit(5).forEach(System.out::println);
	}

}
