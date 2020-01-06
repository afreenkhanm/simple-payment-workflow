package com.example.workflow.service.impl;

import com.example.workflow.service.CamundaWorkflowService;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.workflow.dto.GenericResponseDto;
import com.example.workflow.dto.PaymentDto;
import com.example.workflow.repository.PaymentRepository;
import com.example.workflow.service.PaymentService;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {
	
	private PaymentRepository paymentRepository;
	private CamundaWorkflowService camundaWorkflowService;

	@Autowired
	public PaymentServiceImpl(PaymentRepository paymentRepository, CamundaWorkflowService camundaWorkflowService) {
		this.paymentRepository = paymentRepository;
		this.camundaWorkflowService = camundaWorkflowService;
	}

	@Override
	public GenericResponseDto newPayment(PaymentDto newPayment) {
		GenericResponseDto dto = new GenericResponseDto();
		dto.setData(camundaWorkflowService.initWorkflow(newPayment));
		return dto;
	}

}
