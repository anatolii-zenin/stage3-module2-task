package com.mjc.school.controller.command.implementation;

import com.mjc.school.controller.NewsController;
import com.mjc.school.controller.command.Command;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ReadNewsById implements Command {
    @Autowired
    private NewsController newsController;
    private final String name = "Read News by ID";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void execute() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter ID:");
        Long id = Long.parseLong(in.nextLine());
        System.out.println(newsController.readById(id).toString());
    }
}