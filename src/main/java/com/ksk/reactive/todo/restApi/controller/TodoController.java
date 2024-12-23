package com.ksk.reactive.todo.restApi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ksk.reactive.todo.restApi.payloads.TodoDto;
import com.ksk.reactive.todo.restApi.service.TodoService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/todos")
public class TodoController {
	
	@Autowired
	private TodoService todoService;
	
	@GetMapping
	public Flux<TodoDto> fetchAllTodos() {
		return todoService.fetchAllTodos();
	}
}
