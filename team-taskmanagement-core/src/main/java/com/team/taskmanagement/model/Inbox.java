package com.team.taskmanagement.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Inbox {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(nullable = false)
    private String from;

    private String subject;
    private String emailBody;
    private Date date;

    @Column (columnDefinition = "tinyint default 0")
    private short status;

    @Column (columnDefinition = "tinyint default 0")
    private short assigned;

}
