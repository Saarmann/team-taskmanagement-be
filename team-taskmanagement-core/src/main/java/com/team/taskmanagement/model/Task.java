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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="customerId")
    private Customer customer;

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
