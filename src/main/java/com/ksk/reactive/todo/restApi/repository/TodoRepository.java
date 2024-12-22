package com.ksk.reactive.todo.restApi.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.ksk.reactive.todo.restApi.model.Todo;

public interface TodoRepository extends ReactiveCrudRepository<Todo, Long>{

}
