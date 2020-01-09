package com.example.workflow.service;

import com.example.workflow.dto.GenericResponseDto;
import com.example.workflow.dto.PaymentDto;

public interface PaymentService {
	GenericResponseDto newPayment(PaymentDto newPayment);
}
