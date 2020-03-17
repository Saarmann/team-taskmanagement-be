package com.team.taskmanagement.model;

import lombok.Data;
import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
public class Inbox {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private Date emailDate;
    private String subject;
    private String emailBody;
    private String emailFrom;

    @Column (columnDefinition = "tinyint default 0")
    private short emailStatus;

    @Column (columnDefinition = "tinyint default 0")
    private short emailAssigned;

}
