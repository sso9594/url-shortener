package com.example.urlshortener.service;

import com.example.urlshortener.dto.urldto;
import com.example.urlshortener.entity.url;
import com.example.urlshortener.repository.urlrepository;
import com.example.urlshortener.util.base62;
import com.example.urlshortener.util.initUrl;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


import java.util.Optional;

@Slf4j
@RequiredArgsConstructor
@Transactional
@Service
public class urlservice {

    private final urlrepository url_repository;

    private final base62 base_62;

    private final initUrl initurl;

    public String ToShortUrl(urldto url_dto){

        int id= Optional.ofNullable(url_repository.findByOriginurl(url_dto.getOriginurl()))
                .map(url::getId)
                .orElseGet(()->save(url_dto));
        return base_62.encoding(id);
    }

    public String restoreUrl(String shrturl){
        int id=base_62.decoding(shrturl);
        return findById(id);
    }

    private String findById(int id) {
        url url = url_repository.findById(id)
                    .orElseThrow(()->new EntityNotFoundException("존재하지 않는 URL"));
        return url.getOriginurl();
    }

    private int save(urldto url_dto) {
        url url= url_dto.toUrl();
        url_repository.save(url);

        return url.getId();
    }


}
