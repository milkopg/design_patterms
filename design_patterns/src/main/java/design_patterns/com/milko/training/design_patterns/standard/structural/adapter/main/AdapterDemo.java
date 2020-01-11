package design_patterns.com.milko.training.design_patterns.standard.structural.adapter.main;

import java.util.List;

import design_patterns.com.milko.training.design_patterns.standard.structural.adapter.adapter.api.Employee;
import design_patterns.com.milko.training.design_patterns.standard.structural.adapter.client.EmployeeClient;

public class AdapterDemo {

	public static void main(String[] args) {
		EmployeeClient client = new EmployeeClient();
		List<Employee> employees = client.getEmploeeList();
		System.out.println(employees);
	}

}
