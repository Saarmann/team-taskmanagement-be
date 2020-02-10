package com.team.taskmanagement.model;

import lombok.Data;
import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
//@NamedQuery(query="Select c from Customer c where c.customerName = :customerName",
//            name = "find customer by name")

public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
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

    @Override
    public String toString() {
        return " \n Customer{" +
                "id=" + id +
                ", customerName=" + customerName +
                ", registrationCode='" + registrationCode + '\'' +
                ", vatNo='" + vatNo + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", zip='" + zip + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", contact='" + contact + '\'' +
                ", paymentTerm=" + paymentTerm +
                "} ";
    }

}
