package com.team.taskmanagement.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column (unique = true)
    private String invoiceNumber;

    @Temporal(TemporalType.DATE)
    private Date invoiceDate;

    @Temporal(TemporalType.DATE)
    private Date dueDate;

    private double invoiceAmount;

    @Column (columnDefinition = "integer default 0")
    private int invoiceStatus;

    @Column (columnDefinition = "integer default 0")
    private int invoiceSent;

    @ManyToOne
    @JoinColumn(name = "customerId")
    private Customer customer;

}
