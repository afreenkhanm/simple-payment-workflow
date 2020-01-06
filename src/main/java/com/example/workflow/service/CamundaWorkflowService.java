package com.example.workflow.service;

import com.example.workflow.dto.PaymentDto;

public interface CamundaWorkflowService {
	String initWorkflow(PaymentDto newPayment);
}
