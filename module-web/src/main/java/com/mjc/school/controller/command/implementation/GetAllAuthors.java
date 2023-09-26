package com.mjc.school.controller.command.implementation;

import com.mjc.school.controller.AuthorController;
import com.mjc.school.controller.command.Command;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GetAllAuthors implements Command {
    @Autowired
    private AuthorController authorController;
    private final String name = "Get All Authors";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void execute() {
        for (var authorResp : authorController.readAll()) {
            System.out.println(authorResp.toString());
        }
    }
}