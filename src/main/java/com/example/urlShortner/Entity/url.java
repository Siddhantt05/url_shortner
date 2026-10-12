package com.example.urlShortner.Entity;

import jakarta.persistence.*;
import org.springframework.context.annotation.Primary;

@Entity
public class url {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long Id;
    @Column(nullable = false, unique = true, length = 100)
  private String shortUrl;
    @Column(nullable = false, unique = true, length = 100)
  private String LongUrl;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    public String getLongUrl() {
        return LongUrl;
    }

    public void setLongUrl(String longUrl) {
        LongUrl = longUrl;
    }
}
