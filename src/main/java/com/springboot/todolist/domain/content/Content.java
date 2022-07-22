package com.springboot.todolist.domain.content;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Content {
	private int contentcode;
	private String content;
	private int usercode;
	private LocalDateTime createdate;
	private LocalDateTime updatedate;
}
