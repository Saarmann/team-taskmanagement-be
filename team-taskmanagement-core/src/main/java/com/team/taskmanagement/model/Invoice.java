package com.team.taskmanagement.model;

import lombok.Data;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column (unique = true, nullable = false)
    private String invoiceNumber;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date invoiceDate;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date dueDate;

    @Column
    private double invoiceAmount;

    @Column (columnDefinition = "tinyint default 0")
    private short invoiceStatus;

    @Column (columnDefinition = "tinyint default 0")
    private short invoiceSent;

    @ManyToOne (fetch=FetchType.EAGER)
    @JoinColumn(name = "customerId")
    private Customer customer;

    @OneToOne
    @JoinColumn (name="userId")
    private User user;
}
