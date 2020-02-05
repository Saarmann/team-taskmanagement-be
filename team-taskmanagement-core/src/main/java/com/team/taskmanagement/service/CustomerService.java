package com.team.taskmanagement.service;

import com.team.taskmanagement.beans.CustomerDto;
import com.team.taskmanagement.com.util.BeanMappingUtils;
import com.team.taskmanagement.dao.CustomerDao;
import com.team.taskmanagement.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerDao customerDao;

    public void save(CustomerDto customerDto) {

        Customer customer = BeanMappingUtils.dto2Model(customerDto);
        customerDao.save(customer);
    }

    public List<Customer> viewAllCustomers () {

        return customerDao.findAll();
    }

    public void editCustomer(CustomerDto customerDto) {
        Customer customer = BeanMappingUtils.dto2Model(customerDto);
        customerDao.save(customer);
    }

    public Customer findByCustomerName(String customerName){

        return customerDao.findByCustomerName(customerName);
    }

    public List<Customer> sortByPayment (Integer days){

        return customerDao.customerPayment(days);
    }
}