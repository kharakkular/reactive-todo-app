package com.ksk.reactive.todo.restApi.service;

import java.util.UUID;

import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ksk.reactive.todo.restApi.model.Todo;
import com.ksk.reactive.todo.restApi.payloads.TodoDto;
import com.ksk.reactive.todo.restApi.repository.TodoRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class TodoServiceImpl implements TodoService {
	
	@Autowired
	private TodoRepository todoRepository;
	
	private ModelMapper modelMapper;
	
	public TodoServiceImpl(ModelMapper _modelMapper) {
		this.modelMapper = _modelMapper;
	}

	@Override
	public Mono<TodoDto> createTodo(TodoDto todoDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Flux<TodoDto> fetchAllTodos() {
		return todoRepository.findAll().map(todo -> mappingToTodoDto(todo));
	}

	@Override
	public Mono<TodoDto> fetchById(String uuid) {
		return todoRepository.findById(UUID.fromString(uuid)).map(todo -> mappingToTodoDto(todo));
	}
	
	private TodoDto mappingToTodoDto(Todo todo) {
		TodoDto dto = modelMapper.map(todo, TodoDto.class);
		return dto;
	}
	
	private Todo mappingToTodo(TodoDto dto) {
		Todo todo = modelMapper.map(dto, Todo.class);
		return todo;
	}
}
