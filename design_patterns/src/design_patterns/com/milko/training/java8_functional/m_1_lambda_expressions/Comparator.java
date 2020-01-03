package design_patterns.com.milko.training.java8_functional.m_1_lambda_expressions;

import java.util.function.Function;

@FunctionalInterface
public interface Comparator<T> {
	public int compare(T t1, T t2);

	public static <T> Comparator<T> comparing(Function<T, Comparable> f) {
		return (p1, p2) -> f.apply(p1).compareTo(f.apply(p2));
	}

	public default Comparator<T> thenComparing(Comparator<T> cmp) {
		return (p1, p2) -> compare(p1, p2) == 0 ? cmp.compare(p1, p2) : compare(p1, p2);

	}

	public default Comparator<T> thenComparing(Function<T, Comparable> f) {
		return thenComparing(comparing(f));
	}
}
