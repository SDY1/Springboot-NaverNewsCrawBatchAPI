package com.cos.exam3.batch;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;
import org.springframework.web.client.RestTemplate;

public class NaverCrawTest {
	int aidNum = 1;
	@Test
	public void test1() {
		RestTemplate rt = new RestTemplate();
		String url ="https://news.naver.com/main/read.naver?mode=LSD&mid=shm&sid1=102&oid=022&aid=0000000001";
		String html = rt.getForObject(url, String.class);
		Document doc = Jsoup.parse(html); 
		
		Element companyElement = doc.selectFirst(".press_logo img");
		String company = companyElement.attr("alt");
		
		System.out.println(company);
	}
}
