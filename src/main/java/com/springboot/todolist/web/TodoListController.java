package com.springboot.todolist.web;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.todolist.service.TodoListService;
import com.springboot.todolist.web.dto.CMRespDto;
import com.springboot.todolist.web.dto.CreateContentRespDto;
import com.springboot.todolist.web.dto.CreateTodoListReqDto;
import com.springboot.todolist.web.dto.ReadContentRespDto;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/todolist")
@RequiredArgsConstructor
public class TodoListController {
	
	private final TodoListService todoListService;
	
	@PostMapping("/content")
	public ResponseEntity<?> addList(@RequestBody CreateTodoListReqDto createTodoListReqDto) {
		
		CreateContentRespDto createContentRespDto = null;
		
		try {
			createContentRespDto = todoListService.createTodoList(createTodoListReqDto);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.internalServerError().body(new CMRespDto<>(-1, "todo Content 등록 실패", createContentRespDto));
		}
		
		return ResponseEntity.ok().body(new CMRespDto<>(1, "todo Content 등록 성공", createContentRespDto));
	}
	
	@GetMapping("/list")
	public ResponseEntity<?> getList() {
		
		List<ReadContentRespDto> contentDtoList = null;
		
		try {
			contentDtoList = todoListService.getContentList();
			
		} catch (Exception e) {
			e.getStackTrace();
			return ResponseEntity.internalServerError().body(new CMRespDto<>(-1, "게시글 리스트 페이지 불러오기 실패", contentDtoList));
		}
		
		return ResponseEntity.ok().body(new CMRespDto<>(1, "게시글 리스트 페이지 불러오기 성공", contentDtoList));
	}
}
