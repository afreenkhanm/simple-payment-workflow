package com.example.workflow.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.camunda.bpm.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.workflow.dto.PaymentDto;
import com.example.workflow.service.CamundaWorkflowService;

@Service
public class CamundaWorkflowServiceImpl implements CamundaWorkflowService {

	private RuntimeService runtimeService;

	@Autowired
	public CamundaWorkflowServiceImpl(RuntimeService runtimeService) {
		this.runtimeService = runtimeService;
	}

	@Override
	public String initWorkflow(PaymentDto newPayment) {
		Map<String, Object> workflowVariables = new HashMap<>();
		workflowVariables.put("amount", newPayment.getAmount());
		workflowVariables.put("txId", newPayment.getTxId());
		return runtimeService.createProcessInstanceByKey("payment-application").setVariables(workflowVariables)
				.executeWithVariablesInReturn().getId();
	}
}
