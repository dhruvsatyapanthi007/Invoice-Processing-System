package com.invoiceprocessingsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.invoiceprocessingsystem.backend.model.Invoice;

public interface InvoiceDao extends JpaRepository<Invoice, Integer> {}
