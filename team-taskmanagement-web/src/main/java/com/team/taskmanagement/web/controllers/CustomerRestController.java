package com.team.taskmanagement.web.controllers;


import com.team.taskmanagement.beans.CustomerDto;
import com.team.taskmanagement.model.Customer;
import com.team.taskmanagement.service.CustomerService;
import com.team.taskmanagement.web.beans.ResponseBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("/rest/customer")
public class CustomerRestController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping (value = "/save", method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    ResponseBean<String> moduleProcess(@RequestBody CustomerDto customerDto){
        customerService.save(customerDto);
        return new ResponseBean<>("Customer Saved");
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public List<Customer> customerList() {
        List<Customer> customerList = new ArrayList<>(customerService.viewAllCustomers());
        return customerList;
    }

    @RequestMapping(value = "/{paymentTerm}", method = RequestMethod.GET)
    @ResponseBody
    public List<Customer> customerByPayment (@PathVariable("paymentTerm") Integer days) {
        List<Customer> customerList = new ArrayList<>(customerService.sortByPayment(days));
        return customerList;
    }

    @RequestMapping (value = "/edit", method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    ResponseBean<CustomerDto> customerEdit(@RequestBody CustomerDto customerDto){
        customerService.editCustomer(customerDto);
        return new ResponseBean<CustomerDto>(customerDto);
    }
}
