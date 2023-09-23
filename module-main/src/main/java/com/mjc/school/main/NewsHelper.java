package com.mjc.school.main;

import com.mjc.school.controller.BaseController;
import com.mjc.school.controller.implementation.NewsControllerImpl;
import com.mjc.school.service.dto.NewsDTOReq;
import com.mjc.school.service.dto.NewsDTOResp;
import com.mjc.school.service.dto.implementation.NewsDTOReqImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class NewsHelper {
    private final BaseController<NewsDTOReq, NewsDTOResp, Long> newsController;
    private final AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(MainSpringConfig.class);
    public void getAllNews() {
        for (var newsDTO : newsController.readAll()) {
            System.out.println(newsDTO.toString());
        }
    }

    public NewsHelper() {
        newsController = context.getBean(NewsControllerImpl.class);
    }

    public void getNewsById() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter ID:");
        Long id = Long.parseLong(in.nextLine());
        System.out.println(newsController.readById(id).toString());
    }

    public void createNews() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter title:");
        var title = in.nextLine();
        System.out.println("Enter content:");
        var content = in.nextLine();
        System.out.println("Enter author ID:");
        Long authorID = Long.parseLong(in.nextLine());
        NewsDTOReq newsDTO = (NewsDTOReq) context.getBean("newsDTOReqImpl");
        newsDTO.setTitle(title);
        newsDTO.setContent(content);
        newsDTO.setAuthorId(authorID);
        NewsDTOResp newNews = newsController.create(newsDTO);
        System.out.println(newNews.toString());
    }

    public void updateNews() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter news ID");
        Long newsID = Long.parseLong(in.nextLine());
        System.out.println("Enter title:");
        var title = in.nextLine();
        System.out.println("Enter content:");
        var content = in.nextLine();
        System.out.println("Enter author ID:");
        Long authorID = Long.parseLong(in.nextLine());
        NewsDTOReq newsDTO = (NewsDTOReq) context.getBean("newsDTOReqImpl");
        newsDTO.setId(newsID);
        newsDTO.setTitle(title);
        newsDTO.setContent(content);
        newsDTO.setAuthorId(authorID);
        var updatedNews = newsController.update(newsDTO);
        System.out.println("Success:");
        System.out.println(updatedNews.toString());
    }

    public void deleteNewsById() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter news ID");
        Long newsID = Long.parseLong(in.nextLine());
        if(newsController.deleteById(newsID))
            System.out.println("Success");
    }
}
