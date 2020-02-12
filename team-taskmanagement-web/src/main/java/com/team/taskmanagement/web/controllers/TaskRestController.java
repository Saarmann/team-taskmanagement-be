package com.team.taskmanagement.web.controllers;

import com.team.taskmanagement.beans.TaskDto;
import com.team.taskmanagement.model.Task;
import com.team.taskmanagement.service.TaskService;
import com.team.taskmanagement.web.beans.ResponseBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("/rest/task")
public class TaskRestController {

    @Autowired
    private TaskService taskService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public List<Task> taskList() {
        List<Task> taskList = new ArrayList<>(taskService.viewAllTasks());
        return taskList;
    }

    @RequestMapping (value = "/save", method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    ResponseBean<String> moduleProcess(@RequestBody TaskDto taskDto){
        taskService.save(taskDto);
        return new ResponseBean<>("Task Saved");
    }
}
