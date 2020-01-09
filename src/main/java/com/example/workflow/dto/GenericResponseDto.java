package com.example.workflow.dto;

import lombok.Data;

@Data
public class GenericResponseDto {
	private boolean success = true;
	private Object data;
}
