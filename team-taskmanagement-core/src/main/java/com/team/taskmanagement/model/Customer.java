package com.team.taskmanagement.model;

import lombok.Data;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Data

public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column (unique = true, nullable = false)
    private String customerName;

    @Column (unique = true, nullable = false)
    private String registrationCode;
    private String vatNo;
    private String address;
    private String city;
    private String state;
    private String country;
    private String zip;
    private String customerEmail;
    private String contact;

    @Column (columnDefinition = "smallint default 1")
    private short paymentTerm;

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
