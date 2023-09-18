package com.mjc.school.repository.model.implementation;

import com.mjc.school.repository.model.NewsEntity;

import java.time.LocalDateTime;

public class NewsModel<T> implements NewsEntity<T> {
    @Override
    public T getId() {
        return null;
    }

    @Override
    public void setId(T id) {

    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void setTitle(String title) {

    }

    @Override
    public String getContent() {
        return null;
    }

    @Override
    public void setContent(String content) {

    }

    @Override
    public LocalDateTime getCreateDate() {
        return null;
    }

    @Override
    public void setCreateDate(LocalDateTime createDate) {

    }

    @Override
    public LocalDateTime getLastUpdateDate() {
        return null;
    }

    @Override
    public void setLastUpdateDate(LocalDateTime lastUpdateDate) {

    }

    @Override
    public T getAuthorId() {
        return null;
    }

    @Override
    public void setAuthorId(T authorId) {

    }
}
