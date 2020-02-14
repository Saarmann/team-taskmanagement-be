package com.team.taskmanagement.web.controllers;

import com.team.taskmanagement.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@CrossOrigin
@RequestMapping("/rest/user")
public class UserRestController {

    
    private UserService userService;
}
