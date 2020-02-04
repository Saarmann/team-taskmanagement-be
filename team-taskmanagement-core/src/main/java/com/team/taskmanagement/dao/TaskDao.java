package com.team.taskmanagement.dao;

import com.team.taskmanagement.model.Task;

import java.util.List;

public interface TaskDao {

    public List<Task> myTaskList();

    public List<Task> showByCustomerName (String customerName);


}
