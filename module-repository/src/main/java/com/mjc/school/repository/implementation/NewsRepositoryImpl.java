package com.mjc.school.repository.implementation;

import com.mjc.school.repository.BaseRepository;
import com.mjc.school.repository.model.BaseEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class NewsRepositoryImpl implements BaseRepository {

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
