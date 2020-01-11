package design_patterns.com.milko.training.design_patterns.standard.structural.adapter.adapter.impl;

import design_patterns.com.milko.training.design_patterns.standard.structural.adapter.adapter.api.Employee;
import design_patterns.com.milko.training.design_patterns.standard.structural.adapter.model.EmployeeCSV;

public class EmployeeAdapterCSV implements Employee {
	private EmployeeCSV instance;
	
	public EmployeeAdapterCSV(EmployeeCSV instance) {
		this.instance = instance;
	}
	
	@Override
	public String getId() {
		return instance.getId() + "";
	}

	@Override
	public String getFirstName() {
		return instance.getFirstname();
	}

	@Override
	public String getLastName() {
		return instance.getLastname();
	}

	@Override
	public String getEmail() {
		return instance.getEmailAddress();
	}

}
