package com.mjc.school.repository.datasource;

import com.mjc.school.repository.model.BaseEntity;

import java.util.List;

public interface DataSource {
    List<String> readFile(String filename);
}
