package com.springboot.todolist.service;

import com.springboot.todolist.web.dto.CreateTodoListReqDto;

public interface TodoListService {
	public boolean createTodoList(CreateTodoListReqDto createTodoListReqDto) throws Exception;
}
