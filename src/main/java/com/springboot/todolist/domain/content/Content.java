package com.springboot.todolist.domain.content;

import java.time.LocalDateTime;

import com.springboot.todolist.web.dto.CreateContentRespDto;
import com.springboot.todolist.web.dto.ReadContentRespDto;

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
	private String username;
	private LocalDateTime createdate;
	private LocalDateTime updatedate;
	
	public CreateContentRespDto toCreateContentDto() {
		return CreateContentRespDto.builder()
							.contentcode(contentcode)
							.content(content)
							.usercode(usercode)
							.createdate(createdate)
							.updatedate(updatedate)
							.build();
	}
	
	public ReadContentRespDto toReadConentDto() {
		return ReadContentRespDto.builder()
								.contentcode(contentcode)
								.content(content)
								.usercode(usercode)
								.username(username)
								.createdate(createdate)
								.build();
	}
}
