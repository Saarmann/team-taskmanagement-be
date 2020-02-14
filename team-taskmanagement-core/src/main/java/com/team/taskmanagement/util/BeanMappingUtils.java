package com.team.taskmanagement.util;

import com.team.taskmanagement.beans.CustomerDto;
import com.team.taskmanagement.beans.InvoiceDto;
import com.team.taskmanagement.beans.TaskDto;
import com.team.taskmanagement.beans.UserDto;
import com.team.taskmanagement.model.*;

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

    public static Task dto2Model (TaskDto dto){

        Task task = new Task();
        task.setId(dto.getId());
        task.setEndTime(dto.getEndTime());
        task.setHoursSpent(dto.getHoursSpent());
        task.setStartTime(dto.getStartTime());
        task.setTaskDate(dto.getTaskDate());
        task.setTaskDescription(dto.getTaskDescription());
        task.setPriority(dto.getPriority());
        task.setDeadline(dto.getDeadline());
        task.setTimeSpent(dto.getTimeSpent());
        task.setTaskStatus(dto.getTaskStatus());
        task.setCustomer(dto.getCustomer());
        task.setUser(dto.getUser());
        task.setInvoice(dto.getInvoice());
        return task;
    }

    public static Invoice dto2Model (InvoiceDto dto) {

        Invoice invoice = new Invoice();
        invoice.setId(dto.getId());
        invoice.setInvoiceDate(dto.getInvoiceDate());
        invoice.setCustomer(dto.getCustomer());
        invoice.setUser(dto.getUser());
        invoice.setInvoiceNumber(dto.getInvoiceNumber());
        invoice.setDueDate(dto.getDueDate());
        invoice.setInvoiceAmount(dto.getInvoiceAmount());
        invoice.setInvoiceStatus(dto.getInvoiceStatus());
        invoice.setInvoiceSent(dto.getInvoiceSent());
        return invoice;
    }

    public static User dto2Model (UserDto dto){

        User user = new User();
        user.setFirstname(dto.getFirstname());
        user.setLastname(dto.getLastname());
        user.setEmail(dto.getEmail());
        user.setPassword(dto.getPassword());
        user.setId(dto.getId());
        user.setRole(dto.getRole());
        return user;
    }
}
