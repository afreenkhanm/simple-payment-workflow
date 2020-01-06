package com.example.workflow.service.impl;

import com.example.workflow.dto.PaymentDto;
import com.example.workflow.service.CamundaWorkflowService;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.runtime.ProcessInstanceWithVariables;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CamundaWorkflowServiceImpl implements CamundaWorkflowService {

    @Autowired
    private RuntimeService runtimeService;

    @Override
    public String initWorkflow(PaymentDto newPayment) {

        Map<String, Object> workflowVariables = new HashMap<>();
        workflowVariables.put("amount", newPayment.getAmount());
        workflowVariables.put("txId", newPayment.getTxId());

        ProcessInstanceWithVariables processInstanceWithVariables = runtimeService.createProcessInstanceByKey("payment-application")
                .setVariables(workflowVariables).executeWithVariablesInReturn();

        return processInstanceWithVariables.getId();

    }
}
