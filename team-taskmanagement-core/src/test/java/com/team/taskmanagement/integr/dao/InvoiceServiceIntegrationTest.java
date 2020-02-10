package com.team.taskmanagement.integr.dao;

import com.team.taskmanagement.beans.CustomerDto;
import com.team.taskmanagement.beans.InvoiceDto;
import com.team.taskmanagement.config.TeamTaskMngCoreConfig;
import com.team.taskmanagement.model.Invoice;
import com.team.taskmanagement.service.InvoiceService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InvoiceServiceIntegrationTest {

//    @Test
//    public void testSaveInvoice() {

//        ApplicationContext context = new AnnotationConfigApplicationContext(TeamTaskMngCoreConfig.class);
//        InvoiceService invoiceService = context.getBean(InvoiceService.class);
//        invoiceService.save(mockInvoice());
//        Long savedInvoiceId = invoiceService.save(mockInvoice());
//        System.out.println(savedInvoiceId);
//
//
////        customerService.saveInvoice(mockCustomer());
////     //   Long savedCustomerId =customerService.saveCustomer();
////
//// //       System.out.println(savedCustomerId);
//    }
//
//    InvoiceDto mockInvoice() {
//        InvoiceDto invoice = new InvoiceDto();
//        invoice.setInvoiceNumber("12345");
//        invoice.setInvoiceDate(2020, 10, 10);
//        invoice.setCustomer(mockCustomer());
//        invoice.setDueDate();
//        invoice.setInvoiceAmount(150.50);
//        return invoice;
//    }


//    CustomerDto mockCustomer() {
//        CustomerDto customer = new CustomerDto();
//        customer.setAddress("Address 30");
//        customer.setCity("Helsinki");
//        customer.setContact("+1212 112214");
//        customer.setCountry("Finland");
//        customer.setCustomerEmail("customer@customer.ee");
//        customer.setCustomerName("Company OÜ");
//        customer.setPaymentTerm(10);
//        customer.setRegistrationCode("7775757575");
//        customer.setState("Oulu");
//        customer.setVatNo("7563757");
//        customer.setZip("5357");
//        return customer;
//
//    }
}
