package com.team.taskmanagement.dao;

import com.team.taskmanagement.model.Customer;
import com.team.taskmanagement.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TaskDao {

    public List<Task> myTaskList();

    public List<Task> showByCustomerName (String customerName);


}
