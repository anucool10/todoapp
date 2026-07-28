package com.todo.todoapp.model;


import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Todo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank(message="task name should not be blank")
	private String title;
	private boolean completed;
	@CreationTimestamp
	private LocalDateTime timestamp;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate duedate;
	
	
	public Todo() {
		// TODO Auto-generated constructor stub
	}
	public Todo(Long id, String title, boolean completed,LocalDateTime timestamp, LocalDate duedate) {
		this.id = id;
		this.title = title;
		this.completed = completed;
		this.timestamp = timestamp;
		this.duedate = duedate;
	}
	
	public LocalDate getDuedate() {
		return duedate;
	}
	public void setDuedate(LocalDate duedate) {
		this.duedate = duedate;
	}
	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public boolean getCompleted() {
		return completed;
	}
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

}
