package com.team.taskmanagement.web.controllers;

import com.team.taskmanagement.beans.AuthenticationRequestDto;
import com.team.taskmanagement.beans.AuthenticationResponseDto;
import com.team.taskmanagement.beans.UserDto;
import com.team.taskmanagement.model.User;
import com.team.taskmanagement.service.JwtUtilService;
import com.team.taskmanagement.service.MyUserDetailsService;
import com.team.taskmanagement.service.UserService;
import com.team.taskmanagement.web.beans.ResponseBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("*")
public class UserRestController {

    @Autowired
    private UserService userService;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private MyUserDetailsService userDetailsService;

    @Autowired
    private JwtUtilService jwtTokenUtilService;

    @RequestMapping(value = "/rest/user/team", method = RequestMethod.GET)
    @ResponseBody
    public List<User> myTeamMembers() {
        List<User> teamMembers = new ArrayList<>(userService.viewTeamMembers());
        return teamMembers;
    }

    @RequestMapping (value = "/rest/user/save", method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    ResponseBean<String> moduleProcess(@RequestBody UserDto userDto){
        userService.addTeamMember(userDto);
        return new ResponseBean<>("User Saved");
    }

    @RequestMapping(value = "/authenticate", method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequestDto authenticationRequest) throws Exception {

        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(), authenticationRequest.getPassword())
            );
        }
        catch (BadCredentialsException e) {
            throw new Exception("Incorrect username or password", e);
        }

        final UserDetails userDetails = userDetailsService
                .loadUserByUsername(authenticationRequest.getUsername());

        final String jwt = jwtTokenUtilService.generateToken(userDetails);

        return ResponseEntity.ok(new AuthenticationResponseDto(jwt));
    }
}
