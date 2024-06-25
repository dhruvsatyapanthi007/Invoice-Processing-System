package com.invoiceprocessingsystem.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.invoiceprocessingsystem.backend.model.Invoice;
import com.invoiceprocessingsystem.services.InvoiceService;

@RestController
public class InvoiceController {

    @Autowired
    InvoiceService invoiceService;

    @PostMapping("/add")
    public void addInvoice(@RequestBody Invoice invoice) {
        this.invoiceService.addInvoice(invoice);
    }
}
