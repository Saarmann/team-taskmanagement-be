package com.team.taskmanagement.integr.dao;

import com.team.taskmanagement.config.TeamTaskMngCoreConfig;
import com.team.taskmanagement.service.CustomerService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CustomerServiceIntegrationTest {

   @Test
    public void testSaveCustomer(){

        ApplicationContext context = new AnnotationConfigApplicationContext(TeamTaskMngCoreConfig.class);
        CustomerService customerService= context.getBean(CustomerService.class);

     //   Long savedCustomerId =customerService.saveCustomer();

 //       System.out.println(savedCustomerId);

    }

}
