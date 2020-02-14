package com.team.taskmanagement.beans;

import com.team.taskmanagement.model.Role;
import lombok.Data;

@Data
public class UserDto {

    private long id;

    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private Role role;

}
