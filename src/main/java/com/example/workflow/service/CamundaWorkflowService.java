package com.example.workflow.service;

import com.example.workflow.dto.PaymentDto;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.runtime.ProcessInstanceWithVariables;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

public interface CamundaWorkflowService {

    String initWorkflow(PaymentDto newPayment);

}
