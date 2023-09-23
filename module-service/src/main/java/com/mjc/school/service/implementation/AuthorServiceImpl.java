package com.mjc.school.service.implementation;

import com.mjc.school.dto.AuthorDTOReq;
import com.mjc.school.dto.AuthorDTOResp;
import com.mjc.school.dto.NewsDTOResp;
import com.mjc.school.dto.implementation.AuthorDTOReqImpl;
import com.mjc.school.repository.AuthorRepository;
import com.mjc.school.repository.model.AuthorEntity;
import com.mjc.school.repository.model.implementation.AuthorModel;
import com.mjc.school.service.AuthorService;
import com.mjc.school.service.DTOMapper;
import com.mjc.school.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuthorServiceImpl extends BaseServiceImpl<AuthorDTOReq, AuthorDTOResp, AuthorEntity, AuthorRepository>
        implements AuthorService {
    @Autowired
    private NewsService newsService;
    @Override
    protected AuthorEntity dtoToEntity(AuthorDTOReq authorDTOReq) {
        return DTOMapper.instance.authorReqToEntity((AuthorDTOReqImpl) authorDTOReq);
    }

    @Override
    protected AuthorDTOResp entityToDto(AuthorEntity authorEntity) {
        return DTOMapper.instance.authorToAuthorDto((AuthorModel) authorEntity);
    }

    @Override
    public boolean deleteById(Long id) {
        return repo.deleteById(id) && deleteNewsByAuthorId(id);
    }

    private boolean deleteNewsByAuthorId(Long id) {
        boolean success = true;
        var newsToDelete = getNewsReqByAuthorId(id);
        for (var news : newsToDelete) {
            if (!newsService.deleteById(news.getId()))
                success = false;
        }
        return success;
    }

    private List<NewsDTOResp> getNewsReqByAuthorId(Long id) {
        List<NewsDTOResp> newsByAuthor = new ArrayList<>();
        var allNews = newsService.readAll();
        for (var news : allNews) {
            if (news.getId().equals(id))
                newsByAuthor.add(news);
        }
        return newsByAuthor;
    }

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.repo = authorRepository;
    }
}
