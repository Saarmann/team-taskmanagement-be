package com.team.taskmanagement.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Customer {

    @Id
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

   // private List<Task> customerTasks = new ArrayList<>();

//    @Override
//    public String toString() {
//        return " \n Customer{" +
//                "id=" + id +
//                ", customerName=" + customerName +
//                ", registrationCode='" + registrationCode + '\'' +
//                ", vatNo='" + vatNo + '\'' +
//                ", address='" + address + '\'' +
//                ", city='" + city + '\'' +
//                ", state='" + state + '\'' +
//                ", country='" + country + '\'' +
//                ", zip='" + zip + '\'' +
//                ", customerEmail='" + customerEmail + '\'' +
//                ", contact='" + contact + '\'' +
//                ", paymentTerm=" + paymentTerm +
//                ", customerTasks=" + customerTasks.toString() +
//                "} ";
//    }

}
