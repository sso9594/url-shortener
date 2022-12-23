package com.example.urlshortener.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class initUrl{
    @Value("${server.port}")
    private String port;

    @Value("${server.host}")
    private String host;

    public String init(String encode){
        return "http://" + host + ":" + port + "/" + encode;
    }
}