package com.team.taskmanagement.com.util;

import com.team.taskmanagement.beans.CustomerDto;
import com.team.taskmanagement.model.Customer;

public class BeanMappingUtils {

    public static Customer dto2Model (CustomerDto dto){

        Customer customer = new Customer();
        customer.setId(dto.getId());
        customer.setAddress(dto.getAddress());
        customer.setCity(dto.getCity());
        customer.setContact(dto.getContact());
        customer.setCountry(dto.getCountry());
        customer.setCustomerEmail(dto.getCustomerEmail());
        customer.setCustomerName(dto.getCustomerName());
        customer.setPaymentTerm(dto.getPaymentTerm());
        customer.setRegistrationCode(dto.getRegistrationCode());
        customer.setState(dto.getState());
        customer.setVatNo(dto.getVatNo());
        customer.setZip(dto.getZip());
        return customer;
    }


}
