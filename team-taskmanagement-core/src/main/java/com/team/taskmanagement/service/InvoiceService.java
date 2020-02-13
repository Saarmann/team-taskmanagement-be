package com.team.taskmanagement.service;

import com.team.taskmanagement.beans.InvoiceDto;
import com.team.taskmanagement.util.BeanMappingUtils;
import com.team.taskmanagement.dao.InvoiceDao;
import com.team.taskmanagement.model.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceService {

    @Autowired
    private InvoiceDao invoiceDao;

    public List<Invoice> viewAllInvoices () {
        return invoiceDao.findAll();
    }

    public void save (InvoiceDto invoiceDto) {
        Invoice invoice = BeanMappingUtils.dto2Model(invoiceDto);
        invoiceDao.save(invoice);
    }
}
