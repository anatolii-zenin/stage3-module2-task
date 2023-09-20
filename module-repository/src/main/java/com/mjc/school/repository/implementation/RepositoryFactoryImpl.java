package com.mjc.school.repository.implementation;

import com.mjc.school.repository.AuthorRepository;
import com.mjc.school.repository.NewsRepository;
import com.mjc.school.repository.RepositoryFactory;
import com.mjc.school.repository.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class RepositoryFactoryImpl implements RepositoryFactory {
    private static AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(SpringConfig.class);

    public NewsRepository getNewsRepository() {
        return context.getBean(NewsRepositoryImpl.class);
    }

    public AuthorRepository getAuthorRepository() {
        return context.getBean(AuthorRepositoryImpl.class);
    }
}
