package com.team.taskmanagement.dao;

import com.team.taskmanagement.dao.helpers.CustomerRowMapper;
import com.team.taskmanagement.modal.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.util.List;

@Repository
public class CustomerDaoImpl extends JdbcDaoSupport implements CustomerDao {

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
    public void editCustomer(Customer customer, int id) {

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
}
