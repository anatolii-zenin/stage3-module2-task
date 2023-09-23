package com.mjc.school.service;

import com.mjc.school.dto.implementation.AuthorDTOReqImpl;
import com.mjc.school.dto.implementation.AuthorDTORespImpl;
import com.mjc.school.dto.implementation.NewsDTOReqImpl;
import com.mjc.school.dto.implementation.NewsDTORespImpl;
import com.mjc.school.repository.model.implementation.AuthorModel;
import com.mjc.school.repository.model.implementation.NewsModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DTOMapper {
    DTOMapper instance = Mappers.getMapper(DTOMapper.class);
    NewsDTORespImpl newsToDto(NewsModel newsEntity);
    NewsModel newsReqToEntity(NewsDTOReqImpl newsDTOResp);
    AuthorDTORespImpl authorToAuthorDto(AuthorModel authorEntity);
    AuthorModel authorReqToEntity(AuthorDTOReqImpl authorDTOResp);
}