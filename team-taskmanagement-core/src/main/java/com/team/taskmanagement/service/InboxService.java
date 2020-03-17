package com.team.taskmanagement.service;

<<<<<<< HEAD
import com.team.taskmanagement.dao.InboxDao;
import com.team.taskmanagement.model.Inbox;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class InboxService {

    @Autowired
    private InboxDao inboxDao;

    public List<Inbox> viewAllemails () {
        return inboxDao.findAll();
    }
=======
public class InboxService {
>>>>>>> origin/master
}
