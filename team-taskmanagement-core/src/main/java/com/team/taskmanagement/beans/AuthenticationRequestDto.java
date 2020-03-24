package com.team.taskmanagement.beans;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuthenticationRequestDto {

    private String username;
    private String password;

    public AuthenticationRequestDto(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // need this for serialization?
    public AuthenticationRequestDto() {

    }
}
