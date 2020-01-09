package com.example.workflow.dto;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class PaymentDto {
	private BigDecimal amount;
	private String txId;
}
