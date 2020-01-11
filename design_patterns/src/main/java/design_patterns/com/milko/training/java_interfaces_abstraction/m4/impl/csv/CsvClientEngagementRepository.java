package design_patterns.com.milko.training.java_interfaces_abstraction.m4.impl.csv;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import design_patterns.com.milko.training.java_interfaces_abstraction.m4.api.ClientEngagementRepository;
import design_patterns.com.milko.training.java_interfaces_abstraction.m4.exception.RepositoryException;
import design_patterns.com.milko.training.java_interfaces_abstraction.m4.model.ClientEngagement;
import design_patterns.com.milko.training.java_interfaces_abstraction.m4.query.Query;

public class CsvClientEngagementRepository implements ClientEngagementRepository {

	private final List<ClientEngagement> engagements;
	private final CsvPersistor persistor;

	private int nextId = 1;

	public CsvClientEngagementRepository(final String path) {
		persistor = new CsvPersistor(path);
		engagements = persistor.load();
	}

	@Override
	public void add(ClientEngagement clientEngagement) throws RepositoryException {
		if (clientEngagement.getId() == NO_ID) {
			engagements.add(clientEngagement);
			clientEngagement.setId(nextId++);
		}

	}

	@Override
	public void remove(ClientEngagement clientEngagement) throws RepositoryException {
		if (engagements.removeIf(engagement -> engagement.getId() == clientEngagement.getId())) {
			clientEngagement.setId(NO_ID);;
		}

	}

	@Override
    public Iterable<ClientEngagement> find(final Query query) throws RepositoryException {
        return engagements.stream().filter(filterOf(query)).collect(Collectors.toList());
    }

	private Predicate<? super ClientEngagement> filterOf(Query query) {
		final String client = query.getClient();
		 return engagement -> engagement.getHoursWorked() >= query.getAtLeastHoursWorked() &&
                 (client == null || engagement.getClient().equals(client));
	}

	@Override
	public void close() throws Exception {
		persistor.save(engagements);
	}
}
