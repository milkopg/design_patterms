package design_patterns.com.milko.training.java8_functional.m_3_data_processing_on_collection.pluralsight;

public class City {
	private String name;

	public City() {
	}

	public City(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "City{" + "name=" + name + '}';
	}
}
