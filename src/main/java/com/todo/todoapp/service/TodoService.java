package com.todo.todoapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.todoapp.exception.TodoException;
import com.todo.todoapp.model.Todo;
import com.todo.todoapp.repository.TodoRepository;

@Service
public class TodoService {
	@Autowired
	private TodoRepository todoRepository;
	
	public List<Todo>getAllTodos(){
		return todoRepository.findAll();
	}
	public Todo createTodo(Todo todo) {
        return todoRepository.save(todo);
    }
	public void deleteTodo(Long id) {
        todoRepository.findById(id).orElseThrow(()->new TodoException("Todo not found: "+id));
        todoRepository.deleteById(id);
    }
	public List<Todo>createMultipleTodos(List<Todo> todos){
		return todoRepository.saveAll(todos);
		
	}

	
	

}
