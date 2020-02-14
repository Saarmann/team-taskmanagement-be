package com.team.taskmanagement.web.controllers;

import com.team.taskmanagement.beans.UserDto;
import com.team.taskmanagement.model.User;
import com.team.taskmanagement.service.UserService;
import com.team.taskmanagement.web.beans.ResponseBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("/rest/user")
public class UserRestController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/team", method = RequestMethod.GET)
    @ResponseBody
    public List<User> myTeamMembers() {
        List<User> teamMembers = new ArrayList<>(userService.viewTeamMembers());
        return teamMembers;
    }

    @RequestMapping (value = "/save", method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    ResponseBean<String> moduleProcess(@RequestBody UserDto userDto){
        userService.addTeamMember(userDto);
        return new ResponseBean<>("User Saved");
    }
}
