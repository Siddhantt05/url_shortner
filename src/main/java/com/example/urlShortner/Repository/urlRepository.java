package com.example.urlShortner.Repository;

import com.example.urlShortner.Entity.url;
import org.springframework.data.jpa.repository.JpaRepository;

public interface urlRepository extends JpaRepository<url,Long> {
}
