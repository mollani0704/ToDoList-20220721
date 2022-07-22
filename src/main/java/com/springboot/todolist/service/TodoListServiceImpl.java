package com.springboot.todolist.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.todolist.domain.content.Content;
import com.springboot.todolist.domain.content.ContentRepository;
import com.springboot.todolist.web.dto.CreateContentRespDto;
import com.springboot.todolist.web.dto.CreateTodoListReqDto;
import com.springboot.todolist.web.dto.ReadContentRespDto;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TodoListServiceImpl implements TodoListService{

	private final ContentRepository contentRepository;
	
	@Override
	public CreateContentRespDto createTodoList(CreateTodoListReqDto createTodoListReqDto) throws Exception {
		
		Content content = createTodoListReqDto.toEntity();
		
		contentRepository.save(content);
		
		return content.toCreateContentDto();
	}

	@Override
	public List<ReadContentRespDto> getContentList() throws Exception {
		List<ReadContentRespDto> contentDtoList = new ArrayList<ReadContentRespDto>();
		contentRepository.readContentList().forEach(content -> {
			contentDtoList.add(content.toReadConentDto());
		});
		
		return contentDtoList;
	}

	

}
