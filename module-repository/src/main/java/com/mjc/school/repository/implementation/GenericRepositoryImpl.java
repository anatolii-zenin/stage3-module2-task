package com.mjc.school.repository.implementation;

import com.mjc.school.repository.BaseRepository;
import com.mjc.school.repository.datasource.DataSource;
import com.mjc.school.repository.model.BaseEntity;

import java.util.List;
import java.util.Optional;

public abstract class GenericRepositoryImpl<T extends BaseEntity<Long>> implements BaseRepository<T, Long> {
    protected DataSource dataSource;
    protected List<T> allItems;
    @Override
    public List<T> readAll() {
        return allItems;
    }

    @Override
    public Optional<T> readById(Long id) {
        return allItems.stream().filter(a -> a.getId().equals(id)).findFirst();
    }

    @Override
    public T create(T entity) {
        return null;
    }

    @Override
    public T update(T entity) {
        return null;
    }

    @Override
    public boolean deleteById(Long id) {
        int index = -1;
        Optional<T> newsToDelete = readById(id);
        if (allItems.contains(newsToDelete))
            index = allItems.indexOf(newsToDelete);
        else
            throw new RuntimeException("found no news object with id: " + id);
        allItems.remove(index);
        return true;
    }

    @Override
    public boolean existById(Long id) {
        Optional<T> itemById = readById(id);
        boolean exists = itemById.isPresent() ? true : false;
        return exists;
    }
}
