package com.springboot.todolist.domain.content;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ContentRepository {
	public int save(Content content);
}
