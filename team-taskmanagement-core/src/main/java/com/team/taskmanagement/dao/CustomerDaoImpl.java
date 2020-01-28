package com.team.taskmanagement.dao;

import com.team.taskmanagement.dao.helpers.CustomerRowMapper;
import com.team.taskmanagement.dao.helpers.CustomerTaskExtractor;
import com.team.taskmanagement.modal.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class CustomerDaoImpl extends JdbcDaoSupport implements CustomerDao {

    private static final CustomerTaskExtractor customerTaskExtractor = new CustomerTaskExtractor();

    private static final String QRY_ALl = "SELECT c.id AS cid, c.customer_name, c.city, t.task_date, t.task_description, t.hours_spent " +
                                            "FROM task t " +
                                            "INNER JOIN customer c " +
                                            "ON t.customer_id = c.id " ;

    @Autowired
    private DataSource dataSource;

    @Autowired
    private CustomerRowMapper customerRowMapper;


    @PostConstruct
    public void init(){
        this.setDataSource(dataSource);
    }

    @Override
    public Customer findById(long id) {
        return getJdbcTemplate().queryForObject("SELECT * from Customer where id=?", new Object [] {id}, customerRowMapper);
    }

    @Override
    public List<Customer> myCustomerList() {
        List<Customer> customers = getJdbcTemplate().query("Select * from customer", customerRowMapper);
        return customers;
    }

    @Override
    public void addCustomer(Customer customer) {

        String sql = "INSERT INTO Customer (customer_name,registration_code,vat_no,address,city,state,country,zip,customer_email,contact,payment_term) " +
                "values (?,?,?,?,?,?,?,?,?,?,?)";

        getJdbcTemplate().update(sql, new Object[]{
                customer.getCustomerName(),
                customer.getRegistrationCode(),
                customer.getVatNo(),
                customer.getAddress(),
                customer.getCity(),
                customer.getState(),
                customer.getCountry(),
                customer.getZip(),
                customer.getCustomerEmail(),
                customer.getContact(),
                customer.getPaymentTerm()
        });

    }

    @Override
    public void editCustomer(Customer customer, long id) {

        String sql = "UPDATE Customer set customer_name=?, vat_no=?, address=?, city=?, state=?, country=?, zip=?, customer_email=?, contact=?, payment_term=? " +
                " where id=" +id;

        getJdbcTemplate().update(sql,

                        customer.getCustomerName(),
                        customer.getVatNo(),
                        customer.getAddress(),
                        customer.getCity(),
                        customer.getState(),
                        customer.getCountry(),
                        customer.getZip(),
                        customer.getCustomerEmail(),
                        customer.getContact(),
                        customer.getPaymentTerm()
                );

    }

    @Override
     public List<Customer> findAll () {

        Map<Long, Customer> resultsetAsMap = getJdbcTemplate().query(QRY_ALl,customerTaskExtractor);
        return new ArrayList<Customer>(resultsetAsMap.values()); //removes map keys and takes only values

    }


}
