package com.team.taskmanagement.dao;

import com.team.taskmanagement.dao.helpers.TaskRowMapper;
import com.team.taskmanagement.modal.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

@Repository
public class TaskDaoImpl extends JdbcDaoSupport implements TaskDao {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private TaskRowMapper taskRowMapper;

    @PostConstruct
    public void init(){

        this.setDataSource(dataSource);
    }

//    @Override
//    public List<Task> showByCustomerName(String customerName) {
//
//        String sql = "SELECT task.id, task.task_description, task.hours_spent, customer.customer_name FROM task INNER JOIN +" +
//                " customer on task.customer_id = customer.id WHERE customer.customer.name = " + customerName ;
//
//        return getJdbcTemplate().query(sql,  );
//
//    }

    @Override
    public List<Task> myTaskList() {
        List<Task> myTasks = getJdbcTemplate().query("Select * from task", taskRowMapper);
        return myTasks;

    }

}
