package com.team.taskmanagement.dao.helpers;

import com.team.taskmanagement.modal.Customer;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerRowMapper implements RowMapper<Customer> {

    public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {

        Customer customer = new Customer();
        customer.setId(rs.getInt("id"));
        customer.setCustomerName(rs.getString("customer_name"));
        customer.setRegistrationCode(rs.getString("registration_code"));
        customer.setVatNo(rs.getString("vat_no"));
        customer.setAddress(rs.getNString("address"));
        customer.setCity(rs.getNString("city"));
        customer.setState(rs.getString("state"));
        customer.setCountry(rs.getString("country"));
        customer.setZip(rs.getString("zip"));
        customer.setCustomerEmail(rs.getString("customer_email"));
        customer.setContact(rs.getNString("contact"));
        customer.setPaymentTerm(rs.getInt("payment_term"));
        return customer;
    }

}
