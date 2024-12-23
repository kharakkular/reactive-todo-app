package com.ksk.reactive.todo.restApi.service;

import com.ksk.reactive.todo.restApi.payloads.TodoDto;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TodoService {
	Mono<TodoDto> createTodo(TodoDto todoDto);
	Flux<TodoDto> fetchAllTodos();
	Mono<TodoDto> fetchById(String uuid);
}
