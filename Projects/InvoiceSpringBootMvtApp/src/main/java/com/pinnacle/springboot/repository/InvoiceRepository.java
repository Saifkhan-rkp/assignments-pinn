package com.pinnacle.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pinnacle.springboot.model.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

}