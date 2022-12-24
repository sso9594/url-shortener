package com.example.urlshortener;

import com.example.urlshortener.util.base62;
import com.example.urlshortener.util.initUrl;
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
	@Autowired
	base62 base62;
	@Autowired
	initUrl initUrl;

	@Test
	void contextLoads() {
		urldto url_dto= new urldto();
		url_dto.setOriginurl("https://docs.github.com/ko/get-started/writing-on-github/getting-started-with-writing-and-formatting-on-github/basic-writing-and-formatting-syntax");
		System.out.println(initUrl.init(url_service.ToShortUrl(url_dto)));
		String shortUrl=url_service.ToShortUrl(url_dto);
		System.out.println(shortUrl);
		String origin_url= url_service.restoreUrl(shortUrl);
		System.out.println(base62.decoding(origin_url));

	}

}
