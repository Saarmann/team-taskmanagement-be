package com.team.taskmanagement.dao;

import com.team.taskmanagement.modal.Customer;

import java.util.List;

public interface CustomerDao {

    public void addCustomer (Customer customer);

    public Customer findById (int id);

    public List<Customer> myCustomerList();

    public void editCustomer (Customer customer, int id);

}
