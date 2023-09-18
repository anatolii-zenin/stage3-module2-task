package com.mjc.school.repository.model;

import java.time.LocalDateTime;

public interface NewsEntity<T> extends BaseEntity<T> {
    String getTitle();
    void setTitle(String title);
    String getContent();
    void setContent(String content);
    LocalDateTime getCreateDate();
    void setCreateDate(LocalDateTime createDate);
    LocalDateTime getLastUpdateDate();
    void setLastUpdateDate(LocalDateTime lastUpdateDate);
    T getAuthorId();
    void setAuthorId(T authorId);
}
