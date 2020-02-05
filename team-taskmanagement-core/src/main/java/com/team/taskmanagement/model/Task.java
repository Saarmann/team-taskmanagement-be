package com.team.taskmanagement.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
    private String customerName;
    private String taskDescription;
    private String user;
    private Time timeSpent;
    private double hoursSpent;

  //  private Customer registrationCode;


    @Override
    public String toString() {
        return "\n Task{" +
                "taskDate=" + taskDate +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", customerName='" + customerName + '\'' +
                ", taskDescription='" + taskDescription + '\'' +
                ", user='" + user + '\'' +
                ", timeSpent=" + timeSpent +
                ", hoursSpent=" + hoursSpent +
                '}';
    }
}