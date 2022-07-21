package com.springboot.todolist.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/todolist")
public class TodoListController {
	
	@PostMapping("/content")
	public ResponseEntity<?> addList() {
		return ResponseEntity.ok().body("메소드 체크");
	}
}
