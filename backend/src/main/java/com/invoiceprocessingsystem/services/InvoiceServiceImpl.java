package com.invoiceprocessingsystem.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invoiceprocessingsystem.backend.model.Invoice;
import com.invoiceprocessingsystem.dao.InvoiceDao;

@Service
public class InvoiceServiceImpl implements InvoiceService{
    
    @Autowired
    InvoiceDao invoiceDao;

    @Override
    public Invoice addInvoice(Invoice invoice) {
        invoiceDao.save(invoice);
        return invoice;
    }
}
