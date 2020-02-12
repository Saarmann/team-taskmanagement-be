package com.team.taskmanagement.dao;

import com.team.taskmanagement.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskDao extends JpaRepository<Task, Long> {

}
