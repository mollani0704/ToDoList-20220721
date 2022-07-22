package com.springboot.todolist.web.dto;

import com.springboot.todolist.domain.content.Content;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CreateTodoListReqDto {
	private String content;
	private int usercode;
	
	public Content toEntity() {
		return Content.builder()
				.content(content)
				.usercode(usercode)
				.build();
	}
}
