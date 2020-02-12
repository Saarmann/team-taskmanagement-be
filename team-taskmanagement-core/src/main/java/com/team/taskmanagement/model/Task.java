package com.team.taskmanagement.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
@Data
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private Date taskDate;
    private Time startTime;
    private Time endTime;
    private String taskDescription;
    private Time timeSpent;
    private double hoursSpent;

    @Column (columnDefinition = "tinyint default 0")
    private short taskStatus;

    @ManyToOne
    @JoinTable (name = "task_customer",
            joinColumns = @JoinColumn(name = "taskId"),
            inverseJoinColumns = @JoinColumn(name = "customerId"))
    private Customer customer;

    @ManyToOne
    @JoinTable (name = "task_user",
            joinColumns = @JoinColumn(name = "taskId"),
            inverseJoinColumns = @JoinColumn(name = "userId"))
    private User user;

    @ManyToOne
    @JoinTable (name = "task_invoice",
            joinColumns = @JoinColumn(name = "taskId"),
            inverseJoinColumns = @JoinColumn(name = "invoiceId"))
    private Invoice invoice;

    @Override
    public String toString() {
        return "\n Task{" +
                "taskDate=" + taskDate +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", taskDescription='" + taskDescription + '\'' +
                ", timeSpent=" + timeSpent +
                ", hoursSpent=" + hoursSpent +
                '}';
    }
}
