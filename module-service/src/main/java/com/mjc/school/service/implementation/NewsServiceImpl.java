package com.mjc.school.service.implementation;

import com.mjc.school.dto.NewsDTOReq;
import com.mjc.school.dto.NewsDTOResp;
import com.mjc.school.dto.implementation.NewsDTOReqImpl;
import com.mjc.school.repository.NewsRepository;
import com.mjc.school.repository.model.NewsEntity;
import com.mjc.school.repository.model.implementation.NewsModel;
import com.mjc.school.service.AuthorService;
import com.mjc.school.service.DTOMapper;
import com.mjc.school.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewsServiceImpl extends BaseServiceImpl<NewsDTOReq, NewsDTOResp, NewsEntity, NewsRepository>
        implements NewsService {
    @Autowired
    private AuthorService authorService;
    @Override
    protected NewsEntity dtoToEntity(NewsDTOReq newsDTOReq) {
        return DTOMapper.instance.newsReqToEntity((NewsDTOReqImpl) newsDTOReq);
    }

    @Override
    protected NewsDTOResp entityToDto(NewsEntity newsEntity) {
        return DTOMapper.instance.newsToDto((NewsModel) newsEntity);
    }

    public NewsServiceImpl(NewsRepository newsRepository) {
        this.repo = newsRepository;
    }
}
