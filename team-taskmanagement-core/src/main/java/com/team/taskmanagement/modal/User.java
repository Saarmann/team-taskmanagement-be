package com.team.taskmanagement.modal;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Data
@Entity
@NamedQueries({
        @NamedQuery(
        name = "All_users",
        query = "from User"
        ),

        @NamedQuery(
                name = "User_byId",
                query = "from User where id = :id"
        )
})

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
        return "\n User{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
