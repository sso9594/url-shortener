package com.example.urlshortener.controller;

import com.example.urlshortener.dto.urldto;
import com.example.urlshortener.service.urlservice;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;

@Slf4j
@RequiredArgsConstructor
@Controller
public class homecontroller {
    private final urlservice url_service;

    @GetMapping("/home")
    public String get_url(){
        return "index";
    }

    @PostMapping("/home")
    public String ToShort(urldto url_dto, Model model){

        System.out.println(url_dto.getOriginurl());


        String origin_url=url_dto.getOriginurl();
        model.addAttribute("origin_url",origin_url);
        model.addAttribute("shortUrl",url_service.ToShortUrl(url_dto));
        return "index";
    }

    @GetMapping("/{shortUrl}")
    public String redirect(HttpServletResponse response, @PathVariable String shortUrl) throws IOException{
        System.out.println(shortUrl);
        String origin_url= url_service.restoreUrl(shortUrl);
        if(shortUrl != null){
            return "redirect:"+"http://"+shortUrl;
        }
        return "index";
    }


}
