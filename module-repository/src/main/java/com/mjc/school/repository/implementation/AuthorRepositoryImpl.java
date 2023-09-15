package com.mjc.school.repository.implementation;

import com.mjc.school.repository.BaseRepository;
import com.mjc.school.repository.model.BaseEntity;

import java.util.List;
import java.util.Optional;

public class AuthorRepositoryImpl implements BaseRepository {
    @Override
    public List readAll() {
        return null;
    }

    @Override
    public Optional readById(Object id) {
        return Optional.empty();
    }

    @Override
    public BaseEntity create(BaseEntity entity) {
        return null;
    }

    @Override
    public BaseEntity update(BaseEntity entity) {
        return null;
    }

    @Override
    public boolean deleteById(Object id) {
        return false;
    }

    @Override
    public boolean existById(Object id) {
        return false;
    }
}
