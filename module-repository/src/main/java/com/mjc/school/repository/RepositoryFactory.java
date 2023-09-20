package com.mjc.school.repository;

public interface RepositoryFactory {
    NewsRepository getNewsRepository();
    AuthorRepository getAuthorRepository();
}
