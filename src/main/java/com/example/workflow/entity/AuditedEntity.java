package com.example.workflow.entity;

import java.time.Instant;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuditedEntity {
	@CreationTimestamp
	private Instant createdAt;
	@UpdateTimestamp
	private Instant updatedAt;
}
