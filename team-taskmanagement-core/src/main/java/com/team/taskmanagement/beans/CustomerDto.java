package com.team.taskmanagement.beans;

import com.team.taskmanagement.model.Customer;
import lombok.Data;

import java.util.List;

@Data
public class CustomerDto {

    private Long id;
    private String customerName;
    private String registrationCode;
    private String vatNo;
    private String address;
    private String city;
    private String state;
    private String country;
    private String zip;
    private String customerEmail;
    private String contact;
    private int paymentTerm;

}
