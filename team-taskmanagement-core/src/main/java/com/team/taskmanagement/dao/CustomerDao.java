package com.team.taskmanagement.dao;

import com.team.taskmanagement.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Repository
public interface CustomerDao extends JpaRepository<Customer,Long>{


    Customer findByCustomerName(String customerName);

/*
    @NamedQueries({
            @NamedQuery(
                    name = "All_users",
                    query = "from User"
            ),

            @NamedQuery(
                    name = "User_byId",
                    query = "from User where id = :id"
            )
    })*/


/*
    @Query("your query")
    List<Customer> nonStandardQueryMethod(@Param("tagnames") List<String> tagNames);
*/


/*  private static final String QRY_ALl = "SELECT c.id AS cid, c.customer_name, c.city, t.task_date, t.task_description, t.hours_spent " +
                                            "FROM task t " +
                                            "INNER JOIN customer c " +
                                            "ON t.customer_id = c.id " ;

 */

}

