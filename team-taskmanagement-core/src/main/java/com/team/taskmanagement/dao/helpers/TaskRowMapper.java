package com.team.taskmanagement.dao.helpers;

import com.team.taskmanagement.modal.Task;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TaskRowMapper implements RowMapper<Task> {

    public Task mapRow(ResultSet rs, int rowNum) throws SQLException {

        Task task = new Task();
        task.setTaskDate(rs.getDate("task_date"));
        task.setStartTime(rs.getTime("start_time"));
        task.setEndTime(rs.getTime("end_time"));
        task.setTaskDescription(rs.getString("task_description"));
        task.setTimeSpent(rs.getTime("time_spent"));
        task.setHoursSpent(rs.getDouble("hours_spent"));
        return task;

    }

}
