package com.team.taskmanagement.model;

import javax.persistence.*;

@Entity
public class UserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    private String userRole;
//
//    @Column
//    @OneToOne
//    private User user;
}
