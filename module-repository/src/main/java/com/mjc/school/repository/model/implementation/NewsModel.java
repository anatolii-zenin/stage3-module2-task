package com.mjc.school.repository.model.implementation;

import com.mjc.school.repository.model.NewsEntity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component @Qualifier("NewsModel")
@Setter
@Getter
public class NewsModel implements NewsEntity {
    private Long id;
    private String title;
    private String content;
    private LocalDateTime createDate;
    private LocalDateTime lastUpdateDate;
    private Long authorId;
}
