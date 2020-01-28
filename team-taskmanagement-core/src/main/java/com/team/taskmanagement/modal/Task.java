package com.team.taskmanagement.modal;

import lombok.Data;

import java.sql.Date;
import java.sql.Time;

@Data
public class Task {

    private long id;
    private Date taskDate;
    private Time startTime;
    private Time endTime;
    private String customerName;
    private String taskDescription;
    private String user;
    private Time timeSpent;
    private double hoursSpent;
    private Customer registrationCode;


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
