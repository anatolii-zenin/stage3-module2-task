package com.mjc.school.repository.model;

import java.time.LocalDateTime;

public interface AuthorEntity<T> extends BaseEntity<T> {
    String getName();
    void setName(String name);
    LocalDateTime getCreateDate();
    void setCreateDate(LocalDateTime createDate);
    LocalDateTime getLastUpdateDate();
    void setLastUpdateDate(LocalDateTime lastUpdateDate);
}
