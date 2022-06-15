package com.tuba.api;

import com.tuba.entity.Kulanici;
import com.tuba.repository.KullaniciRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
@RequestMapping("/kullanici")
public class KullaniciApi {
    @Autowired
    private KullaniciRepository kullaniciRepository;

    @PostConstruct
    public void init(){
        Kulanici kullanici=new Kulanici();
        kullanici.setAdi("Tuba");
        kullanici.setSoyadi("Balci");
        kullaniciRepository.save(kullanici);
    }

    @PostMapping
    public ResponseEntity<Kulanici> ekle(@RequestBody Kulanici kulanici){
        return ResponseEntity.ok(kullaniciRepository.save(kulanici));
    }
    @GetMapping
    public ResponseEntity<List<Kulanici>> tumunuListele(){
        return ResponseEntity.ok(kullaniciRepository.findAll());
    }

}
