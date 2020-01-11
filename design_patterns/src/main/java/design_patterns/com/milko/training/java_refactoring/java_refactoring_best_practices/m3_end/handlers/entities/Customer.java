package design_patterns.com.milko.training.java_refactoring.java_refactoring_best_practices.m3_end.handlers.entities;

public class Customer {
	private String membership;
	private String address;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	public Customer(String membership, String address) {
		this.membership = membership;
		this.address = address;
	}
	
	public String getMembership() {
		return membership;
	}
	
	public String getAddress() {
		return address;
	}
}
