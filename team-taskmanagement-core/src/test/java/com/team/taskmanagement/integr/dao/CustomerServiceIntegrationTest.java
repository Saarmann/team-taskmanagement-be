package com.team.taskmanagement.integr.dao;

import com.team.taskmanagement.beans.CustomerDto;
import com.team.taskmanagement.config.TeamTaskMngCoreConfig;
import com.team.taskmanagement.service.CustomerService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CustomerServiceIntegrationTest {

//   @Test
//    public void testSaveCustomer(){
//
//        ApplicationContext context = new AnnotationConfigApplicationContext(TeamTaskMngCoreConfig.class);
//        CustomerService customerService= context.getBean(CustomerService.class);
//        customerService.save(mockCustomer());
//     //   Long savedCustomerId =customerService.saveCustomer();
//
// //       System.out.println(savedCustomerId);
//
//    }
//
//    CustomerDto mockCustomer (){
//       CustomerDto customer = new CustomerDto();
//       customer.setAddress("Address 30");
//       customer.setCity("Helsinki");
//       customer.setContact("+1212 112214");
//       customer.setCountry("Finland");
//       customer.setCustomerEmail("customer@customer.ee");
//       customer.setCustomerName("Company OÜ");
//       customer.setPaymentTerm(10);
//       customer.setRegistrationCode("7775757575");
//       customer.setState("Oulu");
//       customer.setVatNo("7563757");
//       customer.setZip("5357");
//       return customer;
//
//    }

    @Test
    public void viewAllCustomers (){
        ApplicationContext context = new AnnotationConfigApplicationContext(TeamTaskMngCoreConfig.class);
        CustomerService customerService= context.getBean(CustomerService.class);
        System.out.println("Found "+customerService.viewAllCustomers());
    }

//    @Test
//    public void testEditCustomer() {
//
//    ApplicationContext context = new AnnotationConfigApplicationContext(TeamTaskMngCoreConfig.class);
//    CustomerService customerService = context.getBean(CustomerService.class);
//    customerService.editCustomer(mockEditCustomer());
//    }
//
//    CustomerDto mockEditCustomer (){
//       CustomerDto customer = new CustomerDto();
//       customer.setId(2L);
//       customer.setAddress("Address 30");
//       customer.setCity("Tampere");
//       customer.setContact("+1212 112214");
//       customer.setCountry("Finland");
//       customer.setCustomerEmail("customer@customer.ee");
//       customer.setCustomerName("Company OÜ");
//       customer.setPaymentTerm(7);
//       customer.setRegistrationCode("7775757575");
//       customer.setState("Oulu");
//       customer.setVatNo("7563757");
//       customer.setZip("5357");
//       return customer;
//    }

}
