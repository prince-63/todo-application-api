package com.learn.todo.controller;

import com.learn.todo.model.TodoModel;
import com.learn.todo.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("todo")
public class TodoController {
    @Autowired
    private TodoService todoService;

    @GetMapping
    public ResponseEntity<?> getAll() {
        List<TodoModel> listItem = todoService.getAll();
        if (listItem.isEmpty()) {
            return new ResponseEntity<>("Nothing present any todo task",HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok().body(listItem);
    }

    @GetMapping("{id}")
    public Optional<TodoModel> getById(@PathVariable String id) {
        return todoService.getById(id);
    }

    @PostMapping
    public ResponseEntity<String> save(@RequestBody TodoModel todo) {
        todoService.save(todo);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("OK");
    }

    @DeleteMapping("{id}")
    public boolean delete(@PathVariable String id) {
        return todoService.delete(id);
    }
}
