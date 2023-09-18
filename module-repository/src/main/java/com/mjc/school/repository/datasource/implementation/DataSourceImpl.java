package com.mjc.school.repository.datasource.implementation;

import com.mjc.school.repository.datasource.DataSource;
import com.mjc.school.repository.model.BaseEntity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class DataSourceImpl implements DataSource {
    @Override
    public List<String> readFile(String filename) {
        List<String> lines = null;
        try(var inputStream = this.getClass().getResourceAsStream("/" + filename)) {
            assert inputStream != null;
            lines = new BufferedReader(new InputStreamReader(inputStream))
                    .lines().toList();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return lines;
    }
}
