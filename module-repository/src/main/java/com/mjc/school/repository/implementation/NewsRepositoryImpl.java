package com.mjc.school.repository.implementation;

import com.mjc.school.repository.BaseRepository;
import com.mjc.school.repository.model.implementation.NewsModel;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class NewsRepositoryImpl<K> implements BaseRepository<NewsModel<K>, K> {

    @Override
    public List<NewsModel<K>> readAll() {
        return null;
    }

    @Override
    public Optional<NewsModel<K>> readById(K id) {
        return Optional.empty();
    }

    @Override
    public NewsModel<K> create(NewsModel<K> entity) {
        return null;
    }

    @Override
    public NewsModel<K> update(NewsModel<K> entity) {
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
