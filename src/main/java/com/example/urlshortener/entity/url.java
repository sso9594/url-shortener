package com.example.urlshortener.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
public class url {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Lob
    @NotNull
    String originurl;

    @Builder
    public url(int id, String originurl) {
        this.id = id;
        this.originurl = originurl;
    }

}
