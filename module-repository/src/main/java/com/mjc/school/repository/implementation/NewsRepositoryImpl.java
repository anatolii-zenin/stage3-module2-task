package com.mjc.school.repository.implementation;

import com.mjc.school.repository.BaseRepository;
import com.mjc.school.repository.datasource.DataSource;
import com.mjc.school.repository.model.NewsEntity;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository @Qualifier("NewsRepository")
@Scope("singleton")
public class NewsRepositoryImpl extends GenericRepositoryImpl<NewsEntity>
        implements BaseRepository<NewsEntity, Long> {
    @Override
    public NewsEntity create(NewsEntity entity) {
        return null;
    }

    @Override
    public NewsEntity update(NewsEntity entity) {
        return null;
    }

    public NewsRepositoryImpl(DataSource dataSource) {
        this.dataSource = dataSource;
        allItems = dataSource.readAllNews();
    }
}
