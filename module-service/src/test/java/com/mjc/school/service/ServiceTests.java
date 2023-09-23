package com.mjc.school.service;

import com.mjc.school.service.dto.AuthorDTOReq;
import com.mjc.school.service.dto.implementation.AuthorDTOReqImpl;
import com.mjc.school.service.implementation.AuthorServiceImpl;
import com.mjc.school.service.implementation.NewsServiceImpl;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.springframework.test.util.AssertionErrors.assertEquals;

public class ServiceTests {
    private NewsService newsService;
    private AuthorService authorService;

    private static AnnotationConfigApplicationContext context;
    @BeforeAll
    public static void setUp() {
        context = new AnnotationConfigApplicationContext(ServiceSpringConfig.class);
    }
    @AfterAll
    public static void tearDown() {
        context.close();
    }
//    @Test
//    public void newsRepoTest() {
//        newsService = context.getBean(NewsServiceImpl.class);
//        var allNews = newsService.readAll();
//        assertEquals("First entry is not as expected", "GENERAL PROVISIONS", allNews.get(0).getTitle());
//        assertEquals("The number of entries is not as expected", 30, allNews.size());
//
//        assertEquals("Entry is not as expected", "GENERAL PROVISIONS",
//                newsService.readById((long) 0).getTitle());
//    }
//
//    @Test
//    public void authorRepoTest() {
//        authorService = context.getBean(AuthorServiceImpl.class);
//        var allAuthors = authorService.readAll();
//        assertEquals("First entry is not as expected", "William Shakespeare",
//                allAuthors.get(0).getName());
//        assertEquals("The number of entries is not as expected", 30, allAuthors.size());
//
//        assertEquals("Entry is not as expected", "William Shakespeare",
//                authorService.readById((long) 0).getName());
//    }

    @Test
    public void deleteByAuthorIdTest() {
        authorService = context.getBean(AuthorServiceImpl.class);
        newsService = context.getBean(NewsServiceImpl.class);
        authorService.deleteById((long) 0);
        var allAuthors = authorService.readAll();
        var allNews = newsService.readAll();
        assertEquals("First entry is not as expected", "Agatha Christie",
                allAuthors.get(0).getName());
        assertEquals("The number of entries is not as expected", 29, allAuthors.size());
        assertEquals("First entry is not as expected", "EXECUTIVE", allNews.get(0).getTitle());
        assertEquals("The number of entries is not as expected", 29, allNews.size());
    }

    @Test
    public void updateAuthorTest() {
        authorService = context.getBean(AuthorServiceImpl.class);
        AuthorDTOReq req = new AuthorDTOReqImpl();
        req.setId((long) 1);
        req.setName("New Name");
        authorService.update(req);
        var allAuthors = authorService.readAll();
        assertEquals("New name is not as expected", "New Name",
                allAuthors.get(0).getName());
    }
}
