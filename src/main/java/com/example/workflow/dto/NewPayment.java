package com.example.workflow.dto;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class NewPayment {
	private BigDecimal amount;
	private String txId;
}
