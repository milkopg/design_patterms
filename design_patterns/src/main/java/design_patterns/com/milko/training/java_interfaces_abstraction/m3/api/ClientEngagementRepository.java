package design_patterns.com.milko.training.java_interfaces_abstraction.m3.api;

import design_patterns.com.milko.training.java_interfaces_abstraction.m3.exception.RepositoryException;
import design_patterns.com.milko.training.java_interfaces_abstraction.m3.model.ClientEngagement;
import design_patterns.com.milko.training.java_interfaces_abstraction.m3.query.Query;

public interface ClientEngagementRepository {
	int NO_ID = 0;

    void add(ClientEngagement clientEngagement) throws RepositoryException;

    void remove(ClientEngagement clientEngagement) throws RepositoryException;

    Iterable<ClientEngagement> find(Query query) throws RepositoryException;
}
