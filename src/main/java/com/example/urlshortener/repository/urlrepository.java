package com.example.urlshortener.repository;

import com.example.urlshortener.entity.url;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface urlrepository extends JpaRepository<url,Integer> {
    url findByOriginurl(String url);
}
