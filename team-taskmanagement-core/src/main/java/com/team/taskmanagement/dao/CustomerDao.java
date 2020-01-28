package com.team.taskmanagement.dao;

import com.team.taskmanagement.modal.Customer;
import com.team.taskmanagement.modal.Task;

import java.util.List;

public interface CustomerDao {

    public void addCustomer (Customer customer);

    public Customer findById (long id);

    public List<Customer> myCustomerList();

    public void editCustomer (Customer customer, long id);

    public List<Customer> findAll ();


}
