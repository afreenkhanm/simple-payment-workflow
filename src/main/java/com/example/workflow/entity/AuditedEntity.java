package com.example.workflow.entity;

import java.time.Instant;

import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public class AuditedEntity {
	@CreationTimestamp
	private Instant createdAt;
	@UpdateTimestamp
	private Instant updatedAt;
}
