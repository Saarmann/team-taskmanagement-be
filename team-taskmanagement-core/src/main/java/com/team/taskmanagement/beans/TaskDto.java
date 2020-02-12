package com.team.taskmanagement.beans;

import com.team.taskmanagement.model.Customer;
import com.team.taskmanagement.model.Invoice;
import com.team.taskmanagement.model.User;
import lombok.Data;
import java.sql.Date;
import java.sql.Time;

@Data
public class TaskDto {

    private Long id;
    private Date taskDate;
    private Time startTime;
    private Time endTime;
    private String customerName;
    private String taskDescription;
    private Time timeSpent;
    private double hoursSpent;
    private short taskStatus;
    private Customer customer;
    private User user;
    private Invoice invoice;

}
