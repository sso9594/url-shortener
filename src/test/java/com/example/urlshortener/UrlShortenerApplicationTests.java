package com.example.urlshortener;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.urlshortener.dto.urldto;
import com.example.urlshortener.entity.url;
import com.example.urlshortener.service.urlservice;

@SpringBootTest
class UrlShortenerApplicationTests {

	@Autowired
	urlservice url_service;
	@Test
	void contextLoads() {
		urldto url_dto= new urldto();
		url_dto.setOriginurl("http://www.naver.com");
		System.out.println(url_service.ToShortUrl(url_dto));
		String shortUrl=url_service.ToShortUrl(url_dto);
		String origin_url= url_service.restoreUrl(shortUrl);
		System.out.println(origin_url);
	}

}
