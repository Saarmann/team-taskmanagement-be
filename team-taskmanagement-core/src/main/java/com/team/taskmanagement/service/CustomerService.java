package com.team.taskmanagement.service;

import com.team.taskmanagement.dao.CustomerDao;
import com.team.taskmanagement.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerDao customerDao;


    public Long saveCustomer(){

        //customerDao.a
        Customer customerAsModel = null;
        Customer savedCustomer =customerDao.save(customerAsModel);
        return savedCustomer.getId();
    }

}
