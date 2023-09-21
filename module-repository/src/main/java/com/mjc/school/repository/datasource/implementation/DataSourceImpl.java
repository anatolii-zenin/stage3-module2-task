package com.mjc.school.repository.datasource.implementation;

import com.mjc.school.repository.datasource.DataSource;
import com.mjc.school.repository.model.AuthorEntity;
import com.mjc.school.repository.model.NewsEntity;
import com.mjc.school.repository.model.implementation.AuthorModel;
import com.mjc.school.repository.model.implementation.NewsModel;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Component
@Scope("singleton")
public class DataSourceImpl implements DataSource {
    private final String titleFileName = "news";

    private final String contentFileName = "content";

    private final String authorFileName = "authors";

    private List<AuthorEntity> allAuthors = new ArrayList<>();

    private List<NewsEntity> allNews = new ArrayList<>();

    private List<String> readFile(String filename) {
        List<String> lines;
        try(var inputStream = this.getClass().getResourceAsStream("/" + filename)) {
            assert inputStream != null;
            lines = new BufferedReader(new InputStreamReader(inputStream))
                    .lines().toList();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return lines;
    }

    private List<String> readTitleLines() {
        return readFile(titleFileName);
    }

    private List<String> readContentLines() {
        return readFile(titleFileName);
    }

    private List<String> readAuthorLines() {
        return readFile(authorFileName);
    }

    public List<NewsEntity> readAllNews() {
        var titleLines = readTitleLines();
        var contentLines = readContentLines();
        for (int i=0; i < titleLines.size(); i++) {
            NewsEntity news = new NewsModel();
            news.setId((long) i);
            news.setTitle(titleLines.get(i));
            news.setContent(contentLines.get(i));
            news.setAuthorId((long) i);
            var now = LocalDateTime.now();
            news.setCreateDate(now);
            news.setLastUpdateDate(now);

            allNews.add(news);
        }

        return allNews;
    }

    public List<AuthorEntity> readAllAuthors() {
        var authorLines = readAuthorLines();
        for (int i = 0; i < authorLines.size(); i++) {
            AuthorEntity author = new AuthorModel();
            author.setId((long) i);
            author.setName(authorLines.get(i));
            var now = LocalDateTime.now();
            author.setCreateDate(now);
            author.setLastUpdateDate(now);

            allAuthors.add(author);
        }

        return allAuthors;
    }

}
