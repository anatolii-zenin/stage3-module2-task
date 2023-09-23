package com.mjc.school.service.implementation;

import com.mjc.school.repository.BaseRepository;
import com.mjc.school.repository.model.BaseEntity;
import com.mjc.school.service.BaseService;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseServiceImpl<Req, Resp, Entity extends BaseEntity<Long>,
        Repository extends BaseRepository<Entity, Long>>
        implements BaseService<Req, Resp, Long> {
    protected Repository repo;
    @Override
    public List<Resp> readAll() {
        return fetchAll();
    }

    @Override
    public Resp readById(Long id) {
        return entityToDto(repo.readById(id).get());
    }

    @Override
    public Resp create(Req createRequest) {
        return entityToDto(
                repo.create(dtoToEntity(createRequest))
        );
    }

    @Override
    public Resp update(Req updateRequest) {
        return entityToDto(
                repo.update(dtoToEntity(updateRequest))
        );
    }

    @Override
    public boolean deleteById(Long id) {
        return repo.deleteById(id);
    }

    protected List<Resp> fetchAll() {
        List<Entity> entities = repo.readAll();
        List<Resp> news = new ArrayList<>();

        for (var newsEntity : entities)
            news.add(entityToDto(newsEntity));

        return news;
    }

    protected Entity dtoToEntity(Req dto) {
        return null;
    }

    protected Resp entityToDto(Entity model) {
        return null;
    }
}
