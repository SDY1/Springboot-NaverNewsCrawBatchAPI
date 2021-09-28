package com.cos.exam3.batch;

import java.util.List;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.cos.exam3.domain.News;
import com.cos.exam3.domain.NewsRepository;
import com.cos.exam3.util.NaverCraw;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class NewsBatch {
	private final NewsRepository newsRepository;
	private final NaverCraw naverCraw;
	
	@Scheduled(fixedDelay = 1000 * 60 * 1)
	public void newsCrawAndSave() {
		List<News>newsList = naverCraw.collect5();
		newsRepository.saveAll(newsList);
	}
	
}
