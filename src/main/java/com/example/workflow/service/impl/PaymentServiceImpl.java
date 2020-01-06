package com.example.workflow.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.workflow.dto.GenericResponseDto;
import com.example.workflow.dto.PaymentDto;
import com.example.workflow.repository.PaymentRepository;
import com.example.workflow.service.PaymentService;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {
	
	private PaymentRepository paymentRepository;

	@Autowired
	public PaymentServiceImpl(PaymentRepository paymentRepository) {
		this.paymentRepository = paymentRepository;
	}

	@Override
	public GenericResponseDto newPayment(PaymentDto newPayment) {
		GenericResponseDto dto = new GenericResponseDto();
		return dto;
	}

}
