package com.cos.exam3.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@Data
@Document(collection = "naver_news")
public class News {
	@Id
	private String _id;
	
	private String company;
	private String title;
	private String createdAt;	
}
