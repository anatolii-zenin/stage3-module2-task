package com.mjc.school.dto;

import java.time.LocalDateTime;

public interface AuthorDTOResp extends AuthorDTOReq {
    void setCreateDate(LocalDateTime localDateTime);
    LocalDateTime getCreateDate();
    void setLastUpdateDate(LocalDateTime lastUpdateDate);
    LocalDateTime getLastUpdateDate();
}