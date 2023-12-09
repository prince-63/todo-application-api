package com.learn.todo.services;

import com.learn.todo.model.TodoModel;
import com.learn.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Component
public class TodoService {
    @Autowired
    private TodoRepository todoRepository;

    public List<TodoModel> getAll() {
        return todoRepository.findAll();
    }

    public Optional<TodoModel> getById(String id) {
        return todoRepository.findById(id);
    }

    public boolean save(TodoModel todo) {
        todo.setDate(new Date());
        todoRepository.save(todo);
        return true;
    }

    public boolean delete(String id) {
        todoRepository.deleteById(id);
        return true;
    }
}
