package design_patterns.com.milko.training.java_interfaces_abstraction.m4.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Iterator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import design_patterns.com.milko.training.java_interfaces_abstraction.m4.impl.database.DatabaseClientEngagementRepository;
import design_patterns.com.milko.training.java_interfaces_abstraction.m4.model.ClientEngagement;
import design_patterns.com.milko.training.java_interfaces_abstraction.m4.query.Query;

public class DatabaseClientEngagementRepositoryTest {
	private static final String PLURALSIGHT = "Pluralsight";

	static {
		try {
			Class.forName("org.hsqldb.jdbc.JDBCDriver");
		} catch (ClassNotFoundException e) {
			throw new Error(e);
		}
	}

	private DatabaseClientEngagementRepository repository;
	private ClientEngagement engagement = new ClientEngagement(PLURALSIGHT, 10);

	@Before
	public void setUp() throws SQLException {
		final File dbDir = new File("db");
		if (dbDir.listFiles() != null) {
			for (File file : dbDir.listFiles()) {
				assertTrue(file.delete());
			}
		}
		dbDir.delete();

		final Connection connection = DriverManager.getConnection("jdbc:hsqldb:db/clients_database", "SA", "");

		repository = new DatabaseClientEngagementRepository(connection);
	}

	@After
	public void tearDown() throws SQLException {
		repository.close();
	}

	@Test
	public void shouldAddClientEngagement() throws Exception {
		repository.add(engagement);

		assertNotEquals(DatabaseClientEngagementRepository.NO_ID, engagement.getId());
	}

	@Test
	public void shouldRemoveClientEngagement() throws Exception {
		repository.add(engagement);

		repository.remove(engagement);

		assertEquals(DatabaseClientEngagementRepository.NO_ID, engagement.getId());
	}

	@Test
	public void shouldFindRelevantClientEngagements() throws Exception {
		repository.add(engagement);
		repository.add(new ClientEngagement("Foo", 20));
		repository.add(new ClientEngagement(PLURALSIGHT, 20));

		final Iterator<ClientEngagement> engagements = repository
				.find(new Query().atLeastHoursWorked(15).client(PLURALSIGHT)).iterator();

		assertTrue(engagements.hasNext());

		final ClientEngagement result = engagements.next();
		assertEquals(PLURALSIGHT, result.getClient());
		assertEquals(20, result.getHoursWorked());

		assertFalse(engagements.hasNext());
	}

}
