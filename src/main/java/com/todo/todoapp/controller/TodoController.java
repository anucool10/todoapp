package com.todo.todoapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo.todoapp.model.Todo;
import com.todo.todoapp.repository.TodoRepository;
import com.todo.todoapp.service.TodoService;
import java.util.Optional;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/todo")
@Validated
public class TodoController {
	@Autowired
	private TodoService todoService;
	@Autowired
	private final TodoRepository todoRepository;
	
	public TodoController( TodoService todoService, TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
        this.todoService = todoService;
    }

	@GetMapping
	public List<Todo>getTodos(){
		return todoService.getAllTodos();
	}
	
	@PostMapping("/add")
	public List<Todo> createTodo(@Valid @RequestBody List<Todo> todos){
		return todoService.createMultipleTodos(todos);		
		
	}
	@DeleteMapping("/{id}")
	public void deleteTodo(@PathVariable Long id) {
		todoService.deleteTodo(id);		
	}
	@PatchMapping("/{id}/toggle")
	public Todo toggleTodo(@PathVariable Long id) {
		Todo todo = todoRepository.findById(id)
		        .orElseThrow(() -> new RuntimeException("Todo not found"));
		todo.setCompleted(!todo.getCompleted());
		return todoRepository.save(todo);
	}

}
