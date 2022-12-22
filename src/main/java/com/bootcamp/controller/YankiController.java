package com.bootcamp.controller;

import com.bootcamp.model.Yanki;
import com.bootcamp.service.IYankiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.net.URI;

@RestController
public class YankiController {

    @Autowired
    private IYankiService service;

    @PostMapping(value = "/saveYanki")
    public Mono<ResponseEntity<Yanki>> saveYanki(@RequestBody Yanki yanki){
        return service.saveYanki(yanki)
                .map(e -> ResponseEntity
                        .created(URI.create("/api/v1/yankis".concat("/").concat(e.getId())))
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(e)
                );
    }





}