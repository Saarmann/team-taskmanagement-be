package com.team.taskmanagement.com;

import com.team.taskmanagement.config.TeamTaskMngCoreConfig;
import com.team.taskmanagement.dao.CustomerDao;
import com.team.taskmanagement.dao.helpers.MockData;
import com.team.taskmanagement.modal.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static com.team.taskmanagement.dao.helpers.MockData.editCustomer;
import static com.team.taskmanagement.dao.helpers.MockData.newCustomer;

public class DemoMain {

    public static void main(String[] args) {

//        demoDaoImplByName("customerDaoImpl"); //bean name lower case
//        customerList("customerDaoImpl");
//        addNewCustomer("customerDaoImpl");
        editMyCustomer("customerDaoImpl");


    }


    private static void demoDaoImplByName(String daoBeanImpl){
        ApplicationContext context = new AnnotationConfigApplicationContext(TeamTaskMngCoreConfig.class);
        CustomerDao customerDao = context.getBean(daoBeanImpl,CustomerDao.class);
        Customer customer = customerDao.findById(2);
        System.out.println("Found "+customer.toString());

    }

    private static void customerList(String daoBeanImpl){
        ApplicationContext context = new AnnotationConfigApplicationContext(TeamTaskMngCoreConfig.class);
        CustomerDao customerDao = context.getBean(daoBeanImpl,CustomerDao.class);
        System.out.println("Found "+customerDao.myCustomerList());


    }

    private static void addNewCustomer(String daoBeanImpl){
        ApplicationContext context = new AnnotationConfigApplicationContext(TeamTaskMngCoreConfig.class);
        CustomerDao customerDao = context.getBean(daoBeanImpl,CustomerDao.class);
        customerDao.addCustomer(newCustomer());
        System.out.println("Found "+customerDao.myCustomerList());

    }

    private static void editMyCustomer(String daoBeanImpl){
        ApplicationContext context = new AnnotationConfigApplicationContext(TeamTaskMngCoreConfig.class);
        CustomerDao customerDao = context.getBean(daoBeanImpl,CustomerDao.class);
        customerDao.editCustomer(editCustomer(), 2);
        System.out.println("Found "+customerDao.myCustomerList());

    }
}
