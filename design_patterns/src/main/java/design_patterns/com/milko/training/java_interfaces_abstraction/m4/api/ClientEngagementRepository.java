package design_patterns.com.milko.training.java_interfaces_abstraction.m4.api;

import design_patterns.com.milko.training.java_interfaces_abstraction.m4.exception.RepositoryException;
import design_patterns.com.milko.training.java_interfaces_abstraction.m4.model.ClientEngagement;
import design_patterns.com.milko.training.java_interfaces_abstraction.m4.query.Query;

public interface ClientEngagementRepository extends AutoCloseable {
	 	final int NO_ID = 0;

	    void add(ClientEngagement clientEngagement) throws RepositoryException;

	    void remove(ClientEngagement clientEngagement) throws RepositoryException;

	    Iterable<ClientEngagement> find(Query query) throws RepositoryException;
}
