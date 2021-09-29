package com.cos.exam3.web;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cos.exam3.domain.News;
import com.cos.exam3.domain.NewsRepository;
import com.cos.exam3.handler.ex.MyAsyncNotFoundException;
import com.cos.exam3.util.NaverCraw;
import com.cos.exam3.web.dto.CMRespDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class NewsController {

	private final NewsRepository newsRepository;
//	public static String[] arr = new String[200];

	@GetMapping("/news")
	public CMRespDto<News> findAll() {
		News news;
		for (int i = 0; i < 100; i++) {
			news = newsRepository.findById(NaverCraw.aidNumarr[i])
					.orElseThrow(() -> new MyAsyncNotFoundException("내용을 찾을 수 없습니다"));
			return new CMRespDto<>(1, "성공", news);
		}
		return null;
	}
}