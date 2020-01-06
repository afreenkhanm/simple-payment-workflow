package com.example.workflow.service;

import com.example.workflow.dto.GenericResponseDto;
import com.example.workflow.dto.NewPayment;

public interface PaymentService {
	GenericResponseDto newPayment(NewPayment payment);
}
