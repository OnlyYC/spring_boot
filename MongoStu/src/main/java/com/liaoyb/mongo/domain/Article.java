package com.liaoyb.mongo.domain;

import org.springframework.data.annotation.Id;

/**
 * 文章
 * @author ybliao2
 */
public class Article {
	@Id
	private String id;
	private String content;


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
