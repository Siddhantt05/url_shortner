package com.example.urlShortner.Controller;

import com.example.urlShortner.Entity.url;
import com.example.urlShortner.Service.urlService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class urlController {
    private urlService urlService;
    public urlController(urlService urlService){
        this.urlService=urlService;
    }
    @GetMapping("/api/{id}")
    public ResponseEntity<url> get(@PathVariable Long id){
        url response = urlService.get(id);
        return ResponseEntity.status(302).body(response);
    }
}
