package com.example.workflow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.workflow.dto.GenericResponseDto;
import com.example.workflow.dto.PaymentDto;
import com.example.workflow.service.PaymentService;

@RestController("/payments")
public class PaymentsController {

	private PaymentService paymentService;

	@Autowired
	public PaymentsController(PaymentService paymentService) {
		this.paymentService = paymentService;
	}

	@PostMapping("/newPayment")
	public ResponseEntity<GenericResponseDto> newPayment(@RequestBody PaymentDto newPayment) {
		return ResponseEntity.ok(paymentService.newPayment(newPayment));
	}
}
