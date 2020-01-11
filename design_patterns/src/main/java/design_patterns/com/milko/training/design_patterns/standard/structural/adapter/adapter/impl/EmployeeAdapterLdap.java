package design_patterns.com.milko.training.design_patterns.standard.structural.adapter.adapter.impl;

import design_patterns.com.milko.training.design_patterns.standard.structural.adapter.adapter.api.Employee;
import design_patterns.com.milko.training.design_patterns.standard.structural.adapter.model.EmployeeLdap;

public class EmployeeAdapterLdap implements Employee {
	private EmployeeLdap instance;

	public EmployeeAdapterLdap(EmployeeLdap instance) {
		this.instance = instance;
	}
	
	@Override
	public String getId() {
		return instance.getCn();
	}

	@Override
	public String getFirstName() {
		return instance.getGivenName();
	}

	@Override
	public String getLastName() {
		return instance.getSurname();
	}

	@Override
	public String getEmail() {
		return instance.getMail();
	}

}
