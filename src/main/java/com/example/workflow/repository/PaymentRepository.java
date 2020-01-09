package com.example.workflow.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.workflow.entity.Payment;

@Repository
public interface PaymentRepository extends CrudRepository<Payment, Long>{

}
