package com.springboot.todolist.service;

import org.springframework.stereotype.Service;

import com.springboot.todolist.domain.content.Content;
import com.springboot.todolist.domain.content.ContentRepository;
import com.springboot.todolist.web.dto.CreateTodoListReqDto;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TodoListServiceImpl implements TodoListService{

	private final ContentRepository contentRepository;
	
	@Override
	public boolean createTodoList(CreateTodoListReqDto createTodoListReqDto) throws Exception {
		
		Content content = createTodoListReqDto.toEntity();
		
		int result = contentRepository.save(content);
		
		return result > 0;
	}

}
