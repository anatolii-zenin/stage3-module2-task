package com.mjc.school.repository.model.implementation;

import com.mjc.school.repository.model.AuthorEntity;
import com.mjc.school.repository.model.BaseEntity;

import java.time.LocalDateTime;

public class AuthorModel<T> implements AuthorEntity<T> {
    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name) {

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
    public T getId() {
        return null;
    }

    @Override
    public void setId(T id) {

    }
}
