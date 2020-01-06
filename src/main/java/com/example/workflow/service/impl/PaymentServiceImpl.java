package com.example.workflow.service.impl;

import com.example.workflow.dto.GenericResponseDto;
import com.example.workflow.dto.NewPayment;
import com.example.workflow.service.PaymentService;

public class PaymentServiceImpl implements PaymentService {

	@Override
	public GenericResponseDto newPayment(NewPayment payment) {
		GenericResponseDto dto = new GenericResponseDto();
		return dto;
	}

}
