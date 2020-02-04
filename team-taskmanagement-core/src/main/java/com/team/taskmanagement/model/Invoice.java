package com.team.taskmanagement.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Invoice {

    @Id
    private Long id;

    private String invoiceNumber;
    private Date invoiceDate;

}
