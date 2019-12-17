package design_patterns.com.milko.training.java_interfaces_abstraction.m3.main;

import design_patterns.com.milko.training.java_interfaces_abstraction.m3.api.ClientEngagementRepository;
import design_patterns.com.milko.training.java_interfaces_abstraction.m3.model.ClientEngagement;
import design_patterns.com.milko.training.java_interfaces_abstraction.m3.query.Query;

public class ClientEngagementDemo {

	public static void main(String[] args) {
		ClientEngagementRepository repository = null;
		
		final Iterable<ClientEngagement> engagements = repository.find(new Query().atLeastHoursWorked(5).client("Pluralsight"));
		for (ClientEngagement clientEngagement : engagements) {
			
		}
	}

}
