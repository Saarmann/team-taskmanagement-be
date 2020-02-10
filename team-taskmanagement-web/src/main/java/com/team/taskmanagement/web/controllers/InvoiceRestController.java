package com.team.taskmanagement.web.controllers;

import com.team.taskmanagement.beans.InvoiceDto;
import com.team.taskmanagement.model.Invoice;
import com.team.taskmanagement.service.InvoiceService;
import com.team.taskmanagement.web.beans.ResponseBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("/rest/invoice")
public class InvoiceRestController {

    @Autowired
    private InvoiceService invoiceService;

    @RequestMapping (value = "/save", method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    ResponseBean<String> moduleProcess(@RequestBody InvoiceDto invoiceDto){
        invoiceService.save(invoiceDto);
        return new ResponseBean<>("Invoice Saved");
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public List<Invoice> invoiceList() {
        List<Invoice> invoiceList = new ArrayList<>(invoiceService.viewAllInvoices());
        return invoiceList;
    }

}
