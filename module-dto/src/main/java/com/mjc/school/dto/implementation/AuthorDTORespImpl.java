package com.mjc.school.dto.implementation;

import com.mjc.school.dto.AuthorDTOResp;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Setter
@Getter
@Component
public class AuthorDTORespImpl extends AuthorDTOReqImpl implements AuthorDTOResp {
    private LocalDateTime createDate;
    private LocalDateTime lastUpdateDate;
    private static final String dateFormatPattern = "yyyy-MM-dd'T'HH:mm:ss.SSS";
}
