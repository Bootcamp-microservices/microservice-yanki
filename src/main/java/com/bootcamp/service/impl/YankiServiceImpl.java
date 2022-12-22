package com.bootcamp.service.impl;

import com.bootcamp.dto.YankiDto;
import com.bootcamp.model.Yanki;
import com.bootcamp.repository.IYankiRepository;
import com.bootcamp.service.IYankiService;
import com.bootcamp.service.YankiEventService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public class YankiServiceImpl implements IYankiService {

    private final YankiEventService yankiEventService;
    @Autowired
    private IYankiRepository repository;

    @Override
    public Mono<Yanki> saveYanki(Yanki yanki) {
        Mono<Yanki> yankiMono = repository.save(yanki);
        this.yankiEventService.publish(yanki);
        return yankiMono;
    }

    @Override
    public Mono<Yanki> yankiTransaction(YankiDto yankiDto) {
        return null;
    }


}
