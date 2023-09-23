package com.mjc.school.main;

import com.mjc.school.controller.BaseController;
import com.mjc.school.dto.NewsDTOReq;
import com.mjc.school.dto.NewsDTOResp;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        var newsHelper = new NewsHelper();
        Scanner in = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            try {
                System.out.println("""
                        Select operation:
                        0. Get all news
                        1. Get news by ID
                        2. Create news
                        3. Update news
                        4. Delete news by ID
                        -1. Exit""");
                int operationChoice = Integer.parseInt(in.nextLine());
                switch (operationChoice) {
                    case 0 -> newsHelper.getAllNews();
                    case 1 -> newsHelper.getNewsById();
                    case 2 -> newsHelper.createNews();
                    case 3 -> newsHelper.updateNews();
                    case 4 -> newsHelper.deleteNewsById();
                    case -1 -> exit = true;
                    default -> System.out.println("No such operation: " + operationChoice);
                }
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
