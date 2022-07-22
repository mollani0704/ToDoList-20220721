package com.springboot.todolist.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.todolist.service.TodoListService;
import com.springboot.todolist.web.dto.CreateTodoListReqDto;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/todolist")
@RequiredArgsConstructor
public class TodoListController {
	
	private final TodoListService todoListService;
	
	@PostMapping("/content")
	public ResponseEntity<?> addList(@RequestBody CreateTodoListReqDto createTodoListReqDto) {
		
		boolean result = false;
		
		try {
			result = todoListService.createTodoList(createTodoListReqDto);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.internalServerError().body(result);
		}
		
		return ResponseEntity.ok().body(result);
	}
}
