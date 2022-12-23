package com.example.urlshortener.dto;

import com.example.urlshortener.entity.url;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

@Getter
@Setter
public class urldto {
    @URL
    @NotBlank
    private String originurl;

    public url toUrl(){
        return url.builder()
                .originurl(originurl)
                .build();
    }
}
