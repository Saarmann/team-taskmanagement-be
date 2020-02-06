package com.team.taskmanagement.dao;

import com.team.taskmanagement.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CustomerDao extends JpaRepository<Customer,Long>{

    @Query("Select c from Customer c where c.paymentTerm >= :paymentTerm")
    List<Customer> customerPayment(@Param("paymentTerm") Integer days);

//    @Query("Select customerName from Customer c inner join c.customerTasks")
//    List<Customer> resultList ();

  }

