package com.team.taskmanagement.web.controllers;

import com.team.taskmanagement.model.Inbox;
import com.team.taskmanagement.service.InboxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("/rest/inbox")
public class InboxRestController {

    @Autowired
    private InboxService inboxService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public List<Inbox> mailList() {
        List<Inbox> mailList = new ArrayList<>(inboxService.viewAllemails());
        return mailList;
    }

}
