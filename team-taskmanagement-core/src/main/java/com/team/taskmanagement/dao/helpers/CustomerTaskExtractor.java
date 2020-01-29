package com.team.taskmanagement.dao.helpers;

import com.team.taskmanagement.modal.Customer;
import com.team.taskmanagement.modal.Task;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class CustomerTaskExtractor implements ResultSetExtractor<Map<Long, Customer>> {

    @Override
    public Map<Long, Customer> extractData(ResultSet rs) throws SQLException, DataAccessException {

        Map<Long, Customer> tableAsMap = new HashMap<>();

        while(rs.next()){

            Long customerId = rs.getLong("cid");
            Customer customer = tableAsMap.get(customerId);

            if(customer==null){
                customer = mapIntoNewCustomer(rs);
                tableAsMap.put(customerId, customer);
            }
            Task task = mapIntoTask(rs);
            customer.getCustomerTasks().add(task);
        }

        return tableAsMap;
    }

    private Customer mapIntoNewCustomer(ResultSet rs)throws SQLException, DataAccessException{
        Customer customer =new Customer();
        customer.setId(rs.getLong("cid"));
        customer.setCustomerName(rs.getString("customer_name"));
        customer.setCity(rs.getString("city"));
        return customer;

    }

    private Task mapIntoTask(ResultSet rs)throws SQLException, DataAccessException{
        Task task =new Task();
        task.setTaskDate(rs.getDate("task_date"));
        task.setTaskDescription(rs.getString("task_description"));
        task.setHoursSpent(rs.getDouble("hours_spent"));
        return task;

    }


}
