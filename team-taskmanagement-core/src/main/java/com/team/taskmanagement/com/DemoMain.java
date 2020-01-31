package com.team.taskmanagement.com;

import com.team.taskmanagement.config.TeamTaskMngCoreConfig;
import com.team.taskmanagement.dao.CustomerDao;
import com.team.taskmanagement.dao.CustomerDaoImpl;
import com.team.taskmanagement.dao.TaskDao;
import com.team.taskmanagement.dao.UserDao;
import com.team.taskmanagement.dao.helpers.MockData;
import com.team.taskmanagement.modal.Customer;
import com.team.taskmanagement.modal.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

import static com.team.taskmanagement.dao.helpers.MockData.*;

public class DemoMain {

    public static void main(String[] args) {

//        demoDaoImplByName("customerDaoImpl"); //bean name lower case
//        customerList("customerDaoImpl");
//        addNewCustomer("customerDaoImpl");
//        editMyCustomer("customerDaoImpl");
//        taskList("taskDaoImpl");
//        showCustomerTask("taskDaoImpl");
//        customerTask();
//        userByName("userDaoImpl");
//        addNewUser("userDaoImpl");
        updateHiUser("userDaoImpl");
//        userList();

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

    private static void taskList(String daoBeanImpl){
        ApplicationContext context = new AnnotationConfigApplicationContext(TeamTaskMngCoreConfig.class);
        TaskDao taskDao = context.getBean(daoBeanImpl,TaskDao.class);
        System.out.println("Found "+ taskDao.myTaskList());

    }

    private static void showCustomerTask(String daoBeanImpl){
        ApplicationContext context = new AnnotationConfigApplicationContext(TeamTaskMngCoreConfig.class);
        TaskDao taskDao = context.getBean(daoBeanImpl,TaskDao.class);
        System.out.println("Found "+ taskDao.showByCustomerName("New Company"));

    }

    private static void customerTask(){
        ApplicationContext context = new AnnotationConfigApplicationContext(TeamTaskMngCoreConfig.class);
        CustomerDao customerDao = context.getBean(CustomerDao.class);
        List<Customer> customers= customerDao.findAll();

        System.out.println("Found "+ customers.size());
        System.out.println("Found "+ customers.get(1));

    }

    private static void userByName(String daoBeanImpl){
        ApplicationContext context = new AnnotationConfigApplicationContext(TeamTaskMngCoreConfig.class);
        UserDao userDao = context.getBean(daoBeanImpl,UserDao.class);
        User user = userDao.findById(1L);
        System.out.println("Found "+user.toString());
    }

    private static void addNewUser(String daoBeanImpl){
        ApplicationContext context = new AnnotationConfigApplicationContext(TeamTaskMngCoreConfig.class);
        UserDao userDao = context.getBean(daoBeanImpl,UserDao.class);
        userDao.save(mockUser());

    }

    private static void updateHiUser(String daoBeanImpl){
        ApplicationContext context = new AnnotationConfigApplicationContext(TeamTaskMngCoreConfig.class);
        UserDao userDao = context.getBean(daoBeanImpl,UserDao.class);
        userDao.update(updateUser());

    }

    private static void userList() {
        ApplicationContext context = new AnnotationConfigApplicationContext(TeamTaskMngCoreConfig.class);
        UserDao userDao = context.getBean(UserDao.class);
        List<User> users = userDao.findAll();
        System.out.println("Found " + users.toString());
    }
}
