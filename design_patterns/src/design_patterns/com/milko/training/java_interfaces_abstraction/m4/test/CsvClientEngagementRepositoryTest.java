package design_patterns.com.milko.training.java_interfaces_abstraction.m4.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Iterator;

import org.junit.After;
import org.junit.Test;

import design_patterns.com.milko.training.java_interfaces_abstraction.m4.impl.csv.CsvClientEngagementRepository;
import design_patterns.com.milko.training.java_interfaces_abstraction.m4.impl.database.DatabaseClientEngagementRepository;
import design_patterns.com.milko.training.java_interfaces_abstraction.m4.model.ClientEngagement;
import design_patterns.com.milko.training.java_interfaces_abstraction.m4.query.Query;

public class CsvClientEngagementRepositoryTest
{
    private static final String PLURALSIGHT = "Pluralsight";

    private File file = File.createTempFile("database", "csv");
    private CsvClientEngagementRepository repository = new CsvClientEngagementRepository(file.getAbsolutePath());
    private ClientEngagement engagement = new ClientEngagement(PLURALSIGHT, 10);

    public CsvClientEngagementRepositoryTest() throws IOException
    {
    }

    @After
    public void tearDown() throws Exception
    {
        repository.close();
    }

    @Test
    public void shouldAddClientEngagement() throws Exception
    {
        repository.add(engagement);

        assertNotEquals(DatabaseClientEngagementRepository.NO_ID, engagement.getId());
    }

    @Test
    public void shouldRemoveClientEngagement() throws Exception
    {
        repository.add(engagement);

        repository.remove(engagement);

        assertEquals(DatabaseClientEngagementRepository.NO_ID, engagement.getId());
    }

    @Test
    public void shouldFindRelevantClientEngagements() throws Exception
    {
        repository.add(engagement);
        repository.add(new ClientEngagement("Foo", 20));
        repository.add(new ClientEngagement(PLURALSIGHT, 20));

        final Iterator<ClientEngagement> engagements =
                repository.find(new Query().atLeastHoursWorked(15).client(PLURALSIGHT)).iterator();

        assertTrue(engagements.hasNext());

        final ClientEngagement result = engagements.next();
        assertEquals(PLURALSIGHT, result.getClient());
        assertEquals(20, result.getHoursWorked());

        assertFalse(engagements.hasNext());
    }

}
