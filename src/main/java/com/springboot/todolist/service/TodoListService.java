package com.springboot.todolist.service;

import java.util.List;

import com.springboot.todolist.web.dto.CreateContentRespDto;
import com.springboot.todolist.web.dto.CreateTodoListReqDto;
import com.springboot.todolist.web.dto.ReadContentRespDto;

public interface TodoListService {
	public CreateContentRespDto createTodoList(CreateTodoListReqDto createTodoListReqDto) throws Exception;
	public List<ReadContentRespDto> getContentList() throws Exception;
}
