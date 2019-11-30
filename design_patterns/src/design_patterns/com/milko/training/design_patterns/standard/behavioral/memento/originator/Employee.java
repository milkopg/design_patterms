package design_patterns.com.milko.training.design_patterns.standard.behavioral.memento.originator;

import java.io.Serializable;

import design_patterns.com.milko.training.design_patterns.standard.behavioral.memento.memento.EmployeeMemento;

public class Employee implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1969164327706710410L;
	
	private String name;
	private String address;
	private String phone;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	@Override
	public String toString() {
		return name + " : " + phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public EmployeeMemento save() {
		return new EmployeeMemento(name, phone);
	}
	
	public void revert (EmployeeMemento emp) {
		this.name = emp.getName();
		this.phone = emp.getPhone();
	}
}
