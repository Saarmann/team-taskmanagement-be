package com.team.taskmanagement.beans;

import lombok.Data;

import java.util.Date;

@Data
public class InboxDto {

    private Long id;
    private String from;
    private String subject;
    private String emailBody;
    private Date date;
    private short status;
    private short assigned;
}
