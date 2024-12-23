package com.ksk.reactive.todo.restApi.model;

import java.time.LocalDate;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("todos")
public class Todo {
	
	/*
	 * provide a manual way to generate id as @GeneratedValue doesn't work in case of reactive
	 */
	@Id
	private long id;
	
	private String task;
	
	private boolean completed;
	
	private LocalDate dateCreated;
	
	public Todo() {
	}
	
	public Todo(String task, boolean isCompleted, LocalDate createdDate) {
		this.task = task;
		this.completed = isCompleted;
		this.dateCreated = createdDate;
	}
}
