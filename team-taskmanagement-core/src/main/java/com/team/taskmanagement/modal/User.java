package com.team.taskmanagement.modal;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Data
@Entity
//@NamedQueries({
//        @NamedQuery(
//        name = "User_ById",
//        query = "from user where id = :id"
//        ),
//
//        @NamedQuery(
//                name = "User_byLastName",
//                query = "from User where lastname = ;lastname"
//        )
//})

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;


    private String firstname;
    private String lastname;
    private String email;
    private String password;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
