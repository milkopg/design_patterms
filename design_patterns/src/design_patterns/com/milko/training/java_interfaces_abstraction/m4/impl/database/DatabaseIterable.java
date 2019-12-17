package design_patterns.com.milko.training.java_interfaces_abstraction.m4.impl.database;

import java.sql.ResultSet;
import java.util.Iterator;

import design_patterns.com.milko.training.java_interfaces_abstraction.m4.model.ClientEngagement;

class DatabaseIterable implements Iterable<ClientEngagement> {
	private ResultSet resultSet;

	public DatabaseIterable(final ResultSet resultSet) {
		this.resultSet = resultSet;
	}

	@Override
	public Iterator<ClientEngagement> iterator() {
		return new DatabaseIterator(resultSet);
	}
}
