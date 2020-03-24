package com.team.taskmanagement.beans;

import lombok.Getter;

@Getter
public class AuthenticationResponseDto {

    private final String jwt;

    public AuthenticationResponseDto(String jwt) {
        this.jwt = jwt;
    }
}
