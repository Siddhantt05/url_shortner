package com.example.urlShortner.Service;

import com.example.urlShortner.Entity.url;
import com.example.urlShortner.Repository.urlRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class urlService {
   private urlRepository urlRepository;
   urlService(urlRepository urlRepository){
       this.urlRepository=urlRepository;
   }
   public url get(Long id){
       Optional<url> res = urlRepository.findById(id);
       if(res.isPresent()) return res.get();
       return null;
   }
}
