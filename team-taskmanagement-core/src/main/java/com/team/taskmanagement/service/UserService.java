package com.team.taskmanagement.service;

import com.team.taskmanagement.beans.UserDto;
import com.team.taskmanagement.dao.UserDao;
import com.team.taskmanagement.model.User;
import com.team.taskmanagement.util.BeanMappingUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public List<User> viewTeamMembers () {
        return userDao.teamMembers();
    }

    public void editUser(UserDto userDto) {
        User user = BeanMappingUtils.dto2Model(userDto);
        userDao.save(user);
    }

    public void addTeamMember(UserDto userDto){
        User user = BeanMappingUtils.dto2Model(userDto);
        userDao.save(user);
    }

    public void getByUsername () {

    }

}
