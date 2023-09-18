package com.mjc.school.repository.implementation;

import com.mjc.school.repository.BaseRepository;
import com.mjc.school.repository.datasource.DataSource;
import com.mjc.school.repository.model.AuthorEntity;
import com.mjc.school.repository.model.BaseEntity;

import java.util.List;
import java.util.Optional;

public class AuthorRepositoryImpl<K> implements BaseRepository<AuthorEntity<K>, K> {

    @Override
    public List<AuthorEntity<K>> readAll() {
        return null;
    }

    @Override
    public Optional<AuthorEntity<K>> readById(K id) {
        return Optional.empty();
    }

    @Override
    public AuthorEntity<K> create(AuthorEntity<K> entity) {
        return null;
    }

    @Override
    public AuthorEntity<K> update(AuthorEntity<K> entity) {
        return null;
    }

    @Override
    public boolean deleteById(K id) {
        return false;
    }

    @Override
    public boolean existById(K id) {
        return false;
    }
}
