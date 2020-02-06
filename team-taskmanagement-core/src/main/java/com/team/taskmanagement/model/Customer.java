package com.team.taskmanagement.model;

import lombok.Data;
import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "customerId")
//    @OneToMany
//    @JoinColumn(name = "customerId")
//    private Set<Task> task = new HashSet<Task>();

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
