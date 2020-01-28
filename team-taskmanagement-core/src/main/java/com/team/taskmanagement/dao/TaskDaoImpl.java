package com.team.taskmanagement.dao;

import com.team.taskmanagement.dao.helpers.TaskRowMapper;
import com.team.taskmanagement.modal.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.util.List;

@Repository
public class TaskDaoImpl extends JdbcDaoSupport implements TaskDao {

    @Autowired
    private CustomerDaoImpl customerDao;

    @Autowired
    private TaskRowMapper taskRowMapper;

    @Autowired
    private DataSource dataSource;

    @PostConstruct
    public void init() {
        this.setDataSource(dataSource);
    }

    @Override
    public List<Task> myTaskList(){
        List<Task> myTasks = getJdbcTemplate().query("SELECT * from task", taskRowMapper );
        return myTasks;
    }

    @Override
    public List<Task> showByCustomerName(String customerName) {

        String sql = "SELECT task.id, task.task_description, task.hours_spent FROM task INNER JOIN customer on task.customer_id = customer.id WHERE customer.customer_name = "+ "'"+customerName+"'" ;

        return getJdbcTemplate().query(sql, (rs, rowNum) -> {
              Task task = new Task ();
              task.setId(rs.getLong("id"));
              task.setTaskDescription(rs.getString("task_description"));
              task.setHoursSpent(rs.getDouble("hours_spent"));
              return task;

        });

    }
}


