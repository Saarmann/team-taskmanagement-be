package com.team.taskmanagement.dao;

import com.team.taskmanagement.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceDao extends JpaRepository<Invoice, Long> {
}
