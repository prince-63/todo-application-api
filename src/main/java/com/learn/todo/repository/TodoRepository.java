package com.learn.todo.repository;

import com.learn.todo.model.TodoModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TodoRepository extends MongoRepository<TodoModel, String> {
}
