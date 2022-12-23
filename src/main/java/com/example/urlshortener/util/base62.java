package com.example.urlshortener.util;

import org.springframework.stereotype.Component;

@Component
public class base62 {
    private static final int base=62;
    private static final char[] code62="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".toCharArray();

    public String encoding (int id){
        StringBuilder encode = new StringBuilder();

        do{
            encode.append(code62[id%base]);
            id/=base;
        }while(id>0);
        return encode.toString();
    }

    public int decoding (String shrturl){
        int decode=0;
        int mult=1;

        for(int i=0, n=shrturl.length();i<n;i++){
            decode += new String(code62).indexOf(shrturl.charAt(i))*mult;
            mult*=base;
        }
        return decode;
    }
}
