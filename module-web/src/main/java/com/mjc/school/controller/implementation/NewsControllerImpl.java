package com.mjc.school.controller.implementation;

import com.mjc.school.controller.NewsController;
import com.mjc.school.dto.NewsDTOReq;
import com.mjc.school.dto.NewsDTOResp;
import com.mjc.school.service.NewsService;
import org.springframework.stereotype.Controller;

@Controller
public class NewsControllerImpl extends BaseControllerImpl<NewsDTOReq, NewsDTOResp, NewsService>
        implements NewsController {
    public NewsControllerImpl(NewsService newsService) {
        this.service = newsService;
    }
}
