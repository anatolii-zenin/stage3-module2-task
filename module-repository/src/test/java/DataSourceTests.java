import com.mjc.school.repository.datasource.DataSource;
import com.mjc.school.repository.datasource.implementation.DataSourceImpl;
import org.junit.jupiter.api.Test;

import static org.springframework.test.util.AssertionErrors.assertEquals;

public class DataSourceTests {
    @Test
    public void readFileTest() {
        DataSource dataSource = new DataSourceImpl();
        var lines = dataSource.readFile("authors");
        assertEquals("First line is not as expected:", "William Shakespeare", lines.get(0));
    }
}
