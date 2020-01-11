package design_patterns.com.milko.training.java_refactoring.java_refactoring_best_practices.m3_end.handlers.entities;

import java.util.ArrayList;
import java.util.List;

import design_patterns.com.milko.training.java_refactoring.java_refactoring_best_practices.m3_end.handlers.items.Item;

public class Order {

	private Customer customer;
	private List<Item> items;
	private String voucher;

	public Order() {
		items = new ArrayList<>();
	}

	public Order(List<Item> items, String voucher) {
		this.items = items;
		this.voucher = voucher;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public String getVoucher() {
		return voucher;
	}

	public void setVoucher(String voucher) {
		this.voucher = voucher;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
