import com.mjc.school.repository.BaseRepository;
import com.mjc.school.repository.SpringConfig;
import com.mjc.school.repository.datasource.implementation.DataSourceImpl;
import com.mjc.school.repository.implementation.AuthorRepositoryImpl;
import com.mjc.school.repository.model.AuthorEntity;
import com.mjc.school.repository.model.NewsEntity;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

import static org.springframework.test.util.AssertionErrors.assertEquals;

public class DataSourceTests {
    private static AnnotationConfigApplicationContext context;
    @BeforeAll
    public static void setUp() {
        context = new AnnotationConfigApplicationContext(SpringConfig.class);
    }
    @AfterAll
    public static void tearDown() {
        context.close();
    }
    @Test
    public void readAllTest() {
        var dataSource = context.getBean(DataSourceImpl.class);
        List<NewsEntity> news = dataSource.readAllNews();
        assertEquals("First line is not as expected:", "GENERAL PROVISIONS", news.get(0).getTitle());
    }
    @Test
    public void repositoryTest() {
        BaseRepository<AuthorEntity, Long> authorsRepo = context.getBean(AuthorRepositoryImpl.class);
        var str = authorsRepo.readAll().get(0).getName();
        assertEquals("First line is not as expected:", "William Shakespeare", str);
    }
}
