package com.mjc.school.repository.implementation;

import com.mjc.school.repository.BaseRepository;
import com.mjc.school.repository.datasource.DataSource;
import com.mjc.school.repository.model.AuthorEntity;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository @Qualifier("AuthorRepository")
@Scope("singleton")
public class AuthorRepositoryImpl extends GenericRepositoryImpl<AuthorEntity>
        implements BaseRepository<AuthorEntity, Long> {
    @Override
    public AuthorEntity create(AuthorEntity entity) {
        return null;
    }

    @Override
    public AuthorEntity update(AuthorEntity entity) {
        return null;
    }

    public AuthorRepositoryImpl(DataSource dataSource) {
        this.dataSource = dataSource;
        allItems = dataSource.readAllAuthors();
    }
}
