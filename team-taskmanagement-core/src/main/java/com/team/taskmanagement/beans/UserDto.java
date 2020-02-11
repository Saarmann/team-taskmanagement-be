package com.team.taskmanagement.beans;

import lombok.Data;

@Data
public class UserDto {

    private long id;

    private String firstname;
    private String lastname;
    private String email;
    private String password;

}
