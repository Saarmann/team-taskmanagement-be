package com.team.taskmanagement.dao;

import com.team.taskmanagement.modal.User;

public interface UserDao {

    public User findById (Long id);

    public Long save (User newUser);

    public void update (User updatedUser);
    

}
