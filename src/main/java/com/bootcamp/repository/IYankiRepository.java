package com.bootcamp.repository;

import com.bootcamp.model.Yanki;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IYankiRepository extends ReactiveMongoRepository<Yanki, String> {
}
