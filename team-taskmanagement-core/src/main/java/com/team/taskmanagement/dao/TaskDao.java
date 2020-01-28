package com.team.taskmanagement.dao;

import com.team.taskmanagement.modal.Task;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface TaskDao {

    public List<Task> myTaskList();

    public List<Task> showByCustomerName (String customerName);


}
