package com.springboot.todolist.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CreateTodoListReqDto {
	private String content;
	private int usercode;
}
