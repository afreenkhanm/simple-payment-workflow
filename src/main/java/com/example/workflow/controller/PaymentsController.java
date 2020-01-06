package com.example.workflow.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.workflow.dto.GenericResponseDto;
import com.example.workflow.dto.NewPayment;

@RestController("/payments")
public class PaymentsController {

	@PostMapping("/newPayment")
	public ResponseEntity<GenericResponseDto> newPayment(@RequestBody NewPayment payment) {
		return ResponseEntity.ok(new GenericResponseDto());
	}
}
