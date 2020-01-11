package design_patterns.com.milko.training.design_patterns.standard.structural.adapter.client;

import java.util.ArrayList;
import java.util.List;

import design_patterns.com.milko.training.design_patterns.standard.structural.adapter.adapter.api.Employee;
import design_patterns.com.milko.training.design_patterns.standard.structural.adapter.adapter.impl.EmployeeAdapterCSV;
import design_patterns.com.milko.training.design_patterns.standard.structural.adapter.adapter.impl.EmployeeAdapterLdap;
import design_patterns.com.milko.training.design_patterns.standard.structural.adapter.adapter.impl.EmployeeDB;
import design_patterns.com.milko.training.design_patterns.standard.structural.adapter.model.EmployeeCSV;
import design_patterns.com.milko.training.design_patterns.standard.structural.adapter.model.EmployeeLdap;

public class EmployeeClient {
	public List<Employee> getEmploeeList() {
		List<Employee> employees = new ArrayList<Employee>();
		Employee employeeFromDB = new EmployeeDB("1234", "John", "Wick", "john@wick.com");
		employees.add(employeeFromDB);
		
		//Will not work! This is where the adapter comes into play!
		//Employee employeeFromLdap = new EmployeeLdap("chewie", "Solo", "Han", "han@solo.com");

		EmployeeLdap employeeFromLdap = new EmployeeLdap("chewie", "Solo", "Han", "han@solo.com");
		employees.add(new EmployeeAdapterLdap(employeeFromLdap));
		
		EmployeeCSV employeeFromCsv = new EmployeeCSV("567,Sherlock,Holmes,sherlock@holmes.com");
		employees.add(new EmployeeAdapterCSV(employeeFromCsv));
		
		return employees;
	}
}
