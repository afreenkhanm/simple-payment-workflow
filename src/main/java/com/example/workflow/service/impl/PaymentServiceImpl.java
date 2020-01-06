package com.example.workflow.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.workflow.dto.GenericResponseDto;
import com.example.workflow.dto.NewPayment;
import com.example.workflow.repository.PaymentRepository;
import com.example.workflow.service.PaymentService;

public class PaymentServiceImpl implements PaymentService {
	
	private PaymentRepository paymentRepository;

	@Autowired
	public PaymentServiceImpl(PaymentRepository paymentRepository) {
		this.paymentRepository = paymentRepository;
	}

	@Override
	public GenericResponseDto newPayment(NewPayment payment) {
		GenericResponseDto dto = new GenericResponseDto();
		return dto;
	}

}
