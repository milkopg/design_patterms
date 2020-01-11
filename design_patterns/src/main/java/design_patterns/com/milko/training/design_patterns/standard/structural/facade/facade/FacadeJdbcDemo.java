package design_patterns.com.milko.training.design_patterns.standard.structural.facade.facade;

import java.util.List;

public class FacadeJdbcDemo {

	public static void main(String[] args) {
		JdbcFacade jdbcFacade = new JdbcFacade();
		jdbcFacade.createTable();
		System.out.println("Table created");
		
		jdbcFacade.insertIntoTable();
		System.out.println("Record inserterd");
		List<Address> addresses = jdbcFacade.getAddresses();
		for (Address address : addresses) {
			System.out.println(address.getId() + " " + address.getStreetName() + " " + address.getCity());
		}
		
	}

}
