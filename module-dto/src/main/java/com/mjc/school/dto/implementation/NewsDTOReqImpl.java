package com.mjc.school.dto.implementation;

import com.mjc.school.dto.NewsDTOReq;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@Qualifier("NewsReq")
public class NewsDTOReqImpl implements NewsDTOReq {
    protected Long id;
    protected String title;
    protected String content;
    protected Long authorId;
}
