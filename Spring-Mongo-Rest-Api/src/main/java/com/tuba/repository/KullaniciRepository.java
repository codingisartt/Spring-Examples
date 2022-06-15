package com.tuba.repository;

import com.tuba.entity.Kulanici;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface KullaniciRepository extends MongoRepository<Kulanici,String> {

}
