package com.team.taskmanagement.beans;

import com.team.taskmanagement.model.Customer;
import lombok.Data;

import java.util.Date;

@Data
public class InvoiceDto {


    private Long id;
    private String invoiceNumber;
    private Date invoiceDate;
    private Date dueDate;
    private double invoiceAmount;
    private short invoiceStatus;
    private short invoiceSent;
    private Customer customer;

}
