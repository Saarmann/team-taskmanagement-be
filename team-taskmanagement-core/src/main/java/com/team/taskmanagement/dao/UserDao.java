package com.team.taskmanagement.dao;

import com.team.taskmanagement.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserDao extends JpaRepository<User, Long> {

    @Query("Select u from User u where u.role = 2")
    List<User> teamMembers();

    //for authentication
    @Query("Select u from User u where u.username = :username")
    User usersByUsername(String username);

}
