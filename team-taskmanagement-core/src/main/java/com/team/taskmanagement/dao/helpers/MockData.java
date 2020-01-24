package com.team.taskmanagement.dao.helpers;

import com.team.taskmanagement.modal.Customer;

public class MockData {

    public static Customer newCustomer(){

        Customer newCustomer = new Customer();
        newCustomer.setCustomerName("Jopa-Kolla OÜ");
        newCustomer.setRegistrationCode("55454asd54");
        newCustomer.setVatNo("545454");
        newCustomer.setAddress("Customer St 12");
        newCustomer.setCity("Tokyo");
        newCustomer.setState("Jing-Jang");
        newCustomer.setCountry("Poland");
        newCustomer.setZip("545454");
        newCustomer.setCustomerEmail("Joa@business.com");
        newCustomer.setContact("+45545454");
        newCustomer.setPaymentTerm(10);
        return newCustomer;

    }

    public static Customer editCustomer(){

        Customer editCustomer = new Customer();
        editCustomer.setCustomerName("New Company");
        editCustomer.setVatNo("545454");
        editCustomer.setAddress("Customer St 12");
        editCustomer.setCity("Banana Kingdom");
        editCustomer.setState("Super State");
        editCustomer.setCountry("Poland");
        editCustomer.setZip("545454");
        editCustomer.setCustomerEmail("Joa@business.com");
        editCustomer.setContact("+45545454");
        editCustomer.setPaymentTerm(10);
        return editCustomer;

    }



}
