package com.team.taskmanagement.dao;

import com.team.taskmanagement.modal.User;

import java.util.List;

public interface UserDao {

    public User findById (Long id);

    public Long save (User newUser);

    public List<User> findAll ();

    public void update(User updatedUser);


}
