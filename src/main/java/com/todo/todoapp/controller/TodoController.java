package com.todo.todoapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo.todoapp.model.Todo;
import com.todo.todoapp.service.TodoService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/todo")
@Validated
public class TodoController {
	@Autowired
	private TodoService todoService;

	@GetMapping
	public List<Todo>getTodos(){
		return todoService.getAllTodos();
	}
	
	@PostMapping("/add")
	public List<Todo> createTodo(@Valid @RequestBody List<Todo> todos){
		return todoService.createMultipleTodos(todos);
		
		
	}

}
