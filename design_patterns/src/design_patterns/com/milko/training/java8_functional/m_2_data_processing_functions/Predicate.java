package design_patterns.com.milko.training.java8_functional.m_2_data_processing_functions;

@FunctionalInterface
public interface Predicate<T> {
	public boolean test(T t);

	public default Predicate<T> and(Predicate<T> other) {
		return t -> test(t) && other.test(t);
	}

	public default Predicate<T> or(Predicate<T> other) {
		return t -> test(t) || other.test(t);
	}

	public static <T> Predicate<T> isEqualsTo(T t) {
		return s -> s.equals(t) ;
	}
}
