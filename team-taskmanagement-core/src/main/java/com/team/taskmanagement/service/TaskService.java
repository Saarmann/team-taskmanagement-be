package com.team.taskmanagement.service;

import com.team.taskmanagement.beans.TaskDto;
import com.team.taskmanagement.com.util.BeanMappingUtils;
import com.team.taskmanagement.dao.TaskDao;
import com.team.taskmanagement.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskDao taskDao;

    public List<Task> viewAllTasks (){
        return taskDao.findAll();
    }

    public void save(TaskDto taskDto) {
        Task task = BeanMappingUtils.dto2Model(taskDto);
        taskDao.save(task);
    }
}
