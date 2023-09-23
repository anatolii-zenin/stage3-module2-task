package com.mjc.school.controller.implementation;

import com.mjc.school.controller.AuthorController;
import com.mjc.school.dto.AuthorDTOReq;
import com.mjc.school.dto.AuthorDTOResp;
import com.mjc.school.service.AuthorService;
import org.springframework.stereotype.Controller;

@Controller
public class AuthorControllerImpl extends BaseControllerImpl<AuthorDTOReq, AuthorDTOResp, AuthorService>
        implements AuthorController {
    public AuthorControllerImpl(AuthorService authorService) {
        this.service = authorService;
    }
}
