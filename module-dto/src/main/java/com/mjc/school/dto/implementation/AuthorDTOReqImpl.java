package com.mjc.school.dto.implementation;

import com.mjc.school.dto.AuthorDTOReq;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
public class AuthorDTOReqImpl implements AuthorDTOReq {
    protected Long id;
    protected String name;
}
